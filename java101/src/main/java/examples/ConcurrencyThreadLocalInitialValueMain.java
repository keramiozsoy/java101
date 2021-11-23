package examples;

public class ConcurrencyThreadLocalInitialValueMain {
    public static void main(String[] args) {
        ThreadLocal<Object> threadLocal1 = ThreadLocal.withInitial(
                () -> new Object());

        ThreadLocal<Object> threadLocal2 = ThreadLocal.withInitial(
                () -> new Object());

        Thread thread1 = new Thread(
                () -> {
                    System.out.println("Thread1 --- threadLocal1: " + threadLocal1.get());
                    System.out.println("Thread1 --- threadLocal2: " + threadLocal2.get());
                }
        );

        Thread thread2 = new Thread(
                () -> {
                    System.out.println("Thread2 --- threadLocal1: " + threadLocal1.get());
                    System.out.println("Thread2 --- threadLocal2: " + threadLocal2.get());
                }
        );

        thread1.start();
        thread2.start();
    }

}
