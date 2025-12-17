package level02;

import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Level 2 / Exercise 1 (Custom Annotation JASON) ===");

        SweetPerson person = new SweetPerson("Ari", "Bruno", 27);

        try {
            Path createdFile = JsonCuteWriter.writeJsonFile(person);
            System.out.println("JSON created at: " + createdFile.toAbsolutePath());
        } catch (Exception e) {
            System.out.println("Oops! something went wrong: " + e.getMessage());
        }
    }
}
