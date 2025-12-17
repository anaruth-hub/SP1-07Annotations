package level01a;

public class OnsiteWorker extends  Worker {

    public static double benzina = 70.0;

    public OnsiteWorker(String name, String lastname, double priceHours) {
        super(name, lastname, priceHours);
    }

    @Override
    public double calcularSou(int hourWorkedMonth) {
        return (hourWorkedMonth * priceHours) + benzina;
    }

}
