package examples;

public class ConcurrencyThreadSeniorWorkerRunnable  extends ConcurrencyThreadWorkerRunnableBase implements Runnable {

    @Override
    void work() {
        System.out.println(" SeniorWorker - finish ");
    }

    @Override
    public void run() {
        for(int i = 0; i <= 50; i = i + 2){

            System.out.println(
                    "PID - " + Thread.currentThread().getId() + " - " + Thread.currentThread().getName() + " - "  + i
            );
            if (i == 50){
                this.work();
                System.out.println("==============================================");
            }

        }
    }
}
