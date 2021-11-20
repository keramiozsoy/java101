package examples;

import java.util.concurrent.TimeUnit;

public class ConcurrencyThreadStateTerminatedMain {
    public static void main(String[] args) {
        final ConcurrencyThreadStateTerminatedRunnable runnable = new ConcurrencyThreadStateTerminatedRunnable();

        Thread thread = new Thread(runnable);
        thread.start();

        System.out.println(thread.getName() + " is alive and state = " + thread.getState() );

        new Thread(new Runnable() {
            @Override
            public void run() {
                ConcurrencyThreadCustomMonitor.monitor(thread);
            }
        }).start();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         // thread.stop();
         runnable.customStop();

        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("LAST INFO " + thread.getName() + " is dead and state = " + thread.getState() );
    }
}
