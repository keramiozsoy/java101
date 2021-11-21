package examples;

public class ConcurrencyThreadStateWaitingSecondRunnable implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(5_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(
                ConcurrencyThreadStateWaiting.t1.getName() + " = " + ConcurrencyThreadStateWaiting.t1.getState()
                + "\n until t2 has finished"
        );
    }
}
