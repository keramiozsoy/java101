package examples;

public class ConcurrencyThreadWorker extends Thread {
    @Override
    public void run() {
        super.run();

        for(int i = 1; i <= 50; i++){

            System.out.println(
                     "PID - " + this.getId() + " - " + this.getName() + " - "  + i
            );

        }

    }
}
