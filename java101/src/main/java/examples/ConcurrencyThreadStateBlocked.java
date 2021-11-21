package examples;

public class ConcurrencyThreadStateBlocked {
    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                synchronized (this){
                    while(true){
                        System.out.println(" while running ... ");
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };


        Thread thread1 = new Thread(runnable,"T1");
        Thread thread2 = new Thread(runnable,"T2");
        thread1.start();
        thread2.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                ConcurrencyThreadCustomMonitor.monitor(thread1,thread2);
            }
        }).start();


        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.exit(0);

    }
}

