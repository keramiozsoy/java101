package examples;

public class ConcurrencyThreadWorker extends Thread {
    @Override
    public void run() {
        super.run();

        for(int i = 0; i <= 50; i++){

            System.out.println(
                     "PID -> " + this.getId() + " Name -> " + this.getName() + " Count -> " + i
            );
            if (i == 50){
                System.out.println(" ============================================== " +
                        this.getName() + " finished ");


            }

        }

    }
}
