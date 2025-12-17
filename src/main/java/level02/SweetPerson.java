package level02;

@JsonCuteSerializable(directory = "cute-json-output")
public class SweetPerson {
    private final String firstName;
    private final String lastName;
    private final int age;


    public SweetPerson(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
}
