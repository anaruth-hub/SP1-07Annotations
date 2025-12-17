package level01b;

public class SunnyOnsiteWorker extends BunnyWorker {

    public static double gasBonus = 77.7;

    public SunnyOnsiteWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);

    }

    @Override
    public double calcularSou(int monthlyHours) {
        return (monthlyHours * hourlyRate) + gasBonus;

    }

    @Deprecated
    public void printOldBadgeMessage() {
        System.out.println("[DEPRECATED] old badge system: Please show the paper badge at the entrance");
    }

}
