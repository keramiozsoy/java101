package examples;

public class ConcurrencyThreadWorker extends Thread {

    private final int powerCount;
    private final int boxCount;

    public ConcurrencyThreadWorker(int powerCount, int boxCount) {
        this.powerCount = powerCount;
        this.boxCount = boxCount;
    }

    @Override
    public void run() {
        super.run();

        for(int i = 0; i <= boxCount; i = i + powerCount){

            System.out.println(
                     "PID -> " + this.getId() + " Name -> " + this.getName() + " Count -> " + i
            );
            if (i == boxCount){
                System.out.println(" ============================================== " +
                        this.getName() + " finished ");


            }

        }

    }
}
