package examples;

public class ConcurrencyThreadByRunnableWorker implements Runnable {

    private final int powerCount;
    private final int boxCount;

    public ConcurrencyThreadByRunnableWorker(int powerCount, int boxCount) {
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
