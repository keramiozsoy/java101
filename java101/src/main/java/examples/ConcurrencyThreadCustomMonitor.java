package examples;

public class ConcurrencyThreadCustomMonitor {

    public static void monitor(Thread thread) {
        while (thread.isAlive()) {

            System.out.println("======= MONITOR " + thread.getName() + " is alive and state = " + thread.getState());

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println("======= MONITOR " + thread.getName() + " is dead and state = " + thread.getState());

    }

    public static void monitor(Thread thread1, Thread thread2) {
        while (thread1.isAlive() || thread2.isAlive()) {

            System.out.println(
                    "======= MONITOR " + thread1.getName() + " is alive and state = " + thread1.getState()
                            + " \n " +
                            "======= MONITOR " + thread2.getName() + " is alive and state = " + thread2.getState()
            );


            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

        System.out.println(
                "======= MONITOR " + thread1.getName() + " is alive and state = " + thread1.getState()
                        + " \n " +
                        "======= MONITOR " + thread2.getName() + " is alive and state = " + thread2.getState()
        );


    }

}
