package level01a;

public class OnlineWorker extends Worker {

    public static final double FLAT_RATE_INTERNET = 77.0;
    public OnlineWorker(String name, String lastname, double priceHours) {
        super(name, lastname, priceHours);
    }

    @Override
    public double calcularSou(int hoursWorkedMoth) {
        return(hoursWorkedMoth * priceHours) + FLAT_RATE_INTERNET;
    }

}
