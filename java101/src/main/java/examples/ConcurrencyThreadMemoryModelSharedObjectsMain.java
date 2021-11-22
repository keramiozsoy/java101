package examples;

public class ConcurrencyThreadMemoryModelSharedObjectsMain {

    public static void main(String[] args) {
        ConcurrencyThreadMemoryModelMyCustomObject paramObject = new ConcurrencyThreadMemoryModelMyCustomObject();

        Runnable runnable1 = new ConcurrencyThreadMemoryModelMyRunnable(paramObject);

        Thread thread1 = new Thread(runnable1, "T1");
        Thread thread2 = new Thread(runnable1, "T2");

        thread1.start();
        thread2.start();

        System.out.println("breakpoint");
    }

}
