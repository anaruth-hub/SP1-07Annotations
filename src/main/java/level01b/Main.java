package level01b;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Level 1 / Exercise 2 (@Deprecated) ===");

        SunnyOnsiteWorker onsite = new SunnyOnsiteWorker("Arianna", "Barrientos", 14.0);
        CozyRemoteWorker remote = new CozyRemoteWorker("Isabella", "Arzapalo", 12.0);

        NostalgiaCaller caller = new NostalgiaCaller();
        caller.callDeprecatedFeatures(onsite, remote);
    }
}
