package examples;


public class ConcurrencyThreadStateTerminatedMain {
    public static void main(String[] args) {
        final ConcurrencyThreadStateTerminatedRunnable runnable = new ConcurrencyThreadStateTerminatedRunnable();

        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println(thread.getName() + " is alive and state = " + thread.getState() );

        ConcurrencyThreadCustomMonitor.monitor(thread);

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         // thread.stop();
         runnable.customStop();

        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("LAST INFO " + thread.getName() + " is dead and state = " + thread.getState() );
    }
}
