package examples;

public class ConcurrencyThreadStateWaitingFirstRunnable implements Runnable {
    @Override
    public void run() {
        Thread t2 = new Thread(new ConcurrencyThreadStateWaitingSecondRunnable(),"T2");
        t2.start();

        System.out.println(
                ConcurrencyThreadStateWaiting.t1.getName() + " = " + ConcurrencyThreadStateWaiting.t1.getState()
                        + "\n Because " + t2.getName() + " = " + t2.getState()
        );


        try {
            t2.join(); // Wait t2 thread die to continue.
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted " + e);
        }



        System.out.println(
                ConcurrencyThreadStateWaiting.t1.getName() + " = " + ConcurrencyThreadStateWaiting.t1.getState()
               + "\n Because " + t2.getName() + " = " + t2.getState()
        );
    }
}
