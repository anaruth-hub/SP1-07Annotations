package level01a;

public class Worker {

    protected String name;
    protected String lastname;
    protected double priceHours;

    public Worker (String name, String lastname, double priceHours ) {
        this.name = name;
        this.lastname = lastname;
        this.priceHours = priceHours;
   }

   public double calcularSou(int hourWorkedMonth) {
        return hourWorkedMonth * priceHours;
   }

   @Override
    public String toString() {
      return name + " " + lastname + " (price / hour : " + ")";
   }
 }
