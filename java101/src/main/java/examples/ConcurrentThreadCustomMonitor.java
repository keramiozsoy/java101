package examples;

import java.util.concurrent.TimeUnit;

public class ConcurrentThreadCustomMonitor {

    public static void monitorThread(Thread thread) {
        while (thread.isAlive()){

            System.out.println(thread.getName() + " is alive and state = " + thread.getState() );

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println(thread.getName() + " is dead and its state = " + thread.getState());

    }

}
