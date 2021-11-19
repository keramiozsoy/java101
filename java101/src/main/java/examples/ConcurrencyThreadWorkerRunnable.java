package examples;

public class ConcurrencyThreadWorkerRunnable implements Runnable {

    private final int powerCount;
    private final int boxCount;

    public ConcurrencyThreadWorkerRunnable(int powerCount, int boxCount) {
        this.powerCount = powerCount;
        this.boxCount = boxCount;
    }

    @Override
    public void run() {

        for(int i = 0; i <= boxCount; i = i + powerCount){

            System.out.println(
                     "PID - " + Thread.currentThread().getId() + " - " +Thread.currentThread().getName() + " - "  + i
            );
            if (i == boxCount){
                System.out.println("==============================================");
            }

        }

    }
}
