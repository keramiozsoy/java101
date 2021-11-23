package examples;

public class ConcurrencySignalNotifier implements Runnable {
    private ConcurrencySignalMessage msg;

    public ConcurrencySignalNotifier(ConcurrencySignalMessage msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name+" started");
        try {
            Thread.sleep(3000);
            synchronized (msg) {
                msg.setMsg(name+ " Notifier work done");
                msg.notify();
                // msg.notifyAll();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
