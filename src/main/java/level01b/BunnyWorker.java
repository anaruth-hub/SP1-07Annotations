package level01b;

public class BunnyWorker {
    protected String firstname;
    protected String lastName;
    protected double hourlyRate;

    public BunnyWorker(String firstname, String lastName, double hourlyRate) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.hourlyRate = hourlyRate;
}

public double calcularSou(int mothlyHours) {
    return mothlyHours * hourlyRate;

}

public String getFullName() {
        return firstname + " " + lastName;

    }
}
