package examples;

public class ConcurrencyThreadMemoryModelSeparateObjectsMain {
    public static void main(String[] args) {
        ConcurrencyThreadMemoryModelMyCustomObject paramGlobalObject = new ConcurrencyThreadMemoryModelMyCustomObject();

        Runnable runnable1 = new ConcurrencyThreadMemoryModelMyRunnable(paramGlobalObject);
        Runnable runnable2 = new ConcurrencyThreadMemoryModelMyRunnable(paramGlobalObject);

        Thread thread1 = new Thread(runnable1, "T1");
        Thread thread2 = new Thread(runnable2, "T2");

        thread1.start();
        thread2.start();
    }
}
