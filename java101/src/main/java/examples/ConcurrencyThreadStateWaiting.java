package examples;

public class ConcurrencyThreadStateWaiting {
    public static Thread t1;

    public static void main(String[] args) {
        t1 = new Thread(new ConcurrencyThreadStateWaitingFirstRunnable(),"T1");
        t1.start();
    }
}
