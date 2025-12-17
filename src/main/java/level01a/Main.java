package level01a;

public class Main {
    public static void main(String[] args) {

        Worker onsite = new OnsiteWorker("Arianna", "Barrientos", 15.0);
        Worker online = new OnlineWorker("Isabella", "Arzapalo", 12.0);

        int hours = 160;

        System.out.println("Onsite worker: " + onsite);
        System.out.println("Onsite salary: (" + hours + "h): " + onsite.calcularSou(hours));

        System.out.println();

        System.out.println("Online worker: " + online);
        System.out.println("Online salary: (" + hours + "h): " + online.calcularSou(hours));
    }
}
