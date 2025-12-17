package level01b;

public class CozyRemoteWorker extends BunnyWorker {

    public static final double INTERNET_FLAT_FEE = 33.3;

    public CozyRemoteWorker(String firstName, String lastName, double hourlyRate) {
        super(firstName, lastName, hourlyRate);

    }

    @Deprecated
    public void connectUsingOldVnp() {
        System.out.println("[DEPRECATED] Old VNP connection: please migrate to he new secure portal");
    }
}
