package examples;

public class ConcurrencySignalMain {
    public static void main(String[] args) {
        ConcurrencySignalMessage msg = new ConcurrencySignalMessage("process it");

        ConcurrencySignalWaiter waiter1 = new ConcurrencySignalWaiter(msg);
        new Thread(waiter1, "waiter1")
                .start();

        ConcurrencySignalWaiter waiter2 = new ConcurrencySignalWaiter(msg);
        new Thread(waiter2,"waiter2")
                .start();

        ConcurrencySignalNotifier notifier = new ConcurrencySignalNotifier(msg);
        new Thread(notifier, "notifier")
                .start();

        System.out.println("All the threads are started");
    }
}
