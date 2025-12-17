package level02;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.file.Files;
import java.nio.file.Path;

public class JsonCuteWriter {

    public static Path writeJsonFile(Object obj) throws IOException, IllegalAccessException {
        Class<?> clazz = obj.getClass();

        if (!clazz.isAnnotationPresent(JsonCuteSerializable.class)) {
            throw new IllegalArgumentException(
                    "Missing @JsonCuteSerializable on class: " + clazz.getSimpleName()
            );
        }

        JsonCuteSerializable annotation = clazz.getAnnotation(JsonCuteSerializable.class);
        String directoryName = annotation.directory();

        Path directoryPath = Path.of(directoryName);
        Files.createDirectories(directoryPath);

        String json = toJson(obj);

        Path filePath = directoryPath.resolve(clazz.getSimpleName() + ".json");
        Files.writeString(filePath, json);

        return filePath;
    }

    private static String toJson(Object obj) throws IllegalAccessException {
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder sb = new StringBuilder();
        sb.append("{\n");

        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);

            String fieldName = field.getName();
            Object fieldValue = field.get(obj);

            sb.append(" \"").append(fieldName).append("\": ")
                    .append(formatJsonValue(fieldValue));

            if (i < fields.length - 1) sb.append(",");
            sb.append("\n");
        }

        sb.append("}");
        return sb.toString();

    }

    private static String formatJsonValue(Object value) {
        if (value == null) return  "null";

        if (value instanceof String s) {
            return "\"" + escapeJson(s) + "\"";

        }

        if (value instanceof Character c) {
            return "\"" + escapeJson(String.valueOf(c)) + "\"";
        }

        return value.toString();

    }

    private static String escapeJson(String s) {
        return s
                .replace("\\", "\\\\")
                .replace("\"", "\\\"")
                .replace("\n", "\\n")
                .replace("\r", "\\r")
                .replace("\t", "\\t");
    }
}
