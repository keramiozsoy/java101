package examples;

public class ConcurrencyThreadLocalMain {

    public static void main(String[] args) {

        ThreadLocal<String> stringThreadLocal = new InheritableThreadLocal<>();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                stringThreadLocal.set("Thread 1 Val");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                String value = stringThreadLocal.get();
                System.out.println(value);
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                stringThreadLocal.set("Thread 2 Val");

                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                String value = stringThreadLocal.get();
                System.out.println(value);
            }
        });

        thread1.start();
        thread2.start();



        try {
            thread1.join(); // wait thread1 finish
            thread2.join(); // wait thread1 finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(stringThreadLocal.get());

    }


}
