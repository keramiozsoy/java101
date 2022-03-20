package examples;


public class ConcurrencyThreadStateTimedWaiting {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <5; i++) {

                    System.out.println(i);

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };

        Thread thread = new Thread(runnable," ChildThread ");
        thread.start();


        ConcurrencyThreadCustomMonitor.monitor(thread);

    }
}
