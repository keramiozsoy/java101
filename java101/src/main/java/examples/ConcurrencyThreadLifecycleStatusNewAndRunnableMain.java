package examples;

public class ConcurrencyThreadLifecycleStatusNewAndRunnableMain {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("test");

        Thread thread = new Thread(runnable,"T1");

        System.out.println(thread.getName() +  " - " + thread.getState());

        thread.start();

        System.out.println(thread.getName() +  " - " + thread.getState());
    }
}
