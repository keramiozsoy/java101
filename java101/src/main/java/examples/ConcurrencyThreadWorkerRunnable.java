package examples;

public class ConcurrencyThreadWorkerRunnable extends ConcurrencyThreadWorkerRunnableBase implements Runnable {


    @Override
    void work() {
        System.out.println(" Worker - finish ");
    }

    @Override
    public void run() {

        for(int i = 0; i <= 50; i++){

            System.out.println(
                     "PID - " + Thread.currentThread().getId() + " - " +Thread.currentThread().getName() + " - "  + i
            );
            if (i == 50){
                this.work();
                System.out.println("==============================================");
            }

        }

    }
}
