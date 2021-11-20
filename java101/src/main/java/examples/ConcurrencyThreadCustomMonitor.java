package examples;

import java.util.concurrent.TimeUnit;

public class ConcurrencyThreadCustomMonitor {

    public static void monitor(Thread thread) {
        while (thread.isAlive()){

            System.out.println("======= MONITOR " + thread.getName() + " is alive and state = " + thread.getState() );

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("======= MONITOR " + thread.getName() + " is dead and state = " + thread.getState());

    }

}