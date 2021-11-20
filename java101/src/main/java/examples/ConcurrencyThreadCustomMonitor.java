package examples;

public class ConcurrencyThreadCustomMonitor {

    public static void monitor(Thread thread) {
        while (thread.isAlive()){

            System.out.println("======= MONITOR " + thread.getName() + " is alive and state = " + thread.getState() );

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("======= MONITOR " + thread.getName() + " is dead and state = " + thread.getState());

    }

}
