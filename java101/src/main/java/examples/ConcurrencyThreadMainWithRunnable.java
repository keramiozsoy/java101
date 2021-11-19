package examples;

public class ConcurrencyThreadMainWithRunnable {
    public static void main(String[] args) {

        int allBoxCount = 100;
        int workerBox =  30;
        int remainBox = allBoxCount - workerBox;

        ConcurrencyThreadWorkerRunnable worker1 = new ConcurrencyThreadWorkerRunnable(1,workerBox);
        ConcurrencyThreadWorkerRunnable worker2 = new ConcurrencyThreadWorkerRunnable(2,remainBox);

        Thread t1 = new Thread(worker1, "T1");
        Thread t2 = new Thread(worker2, "T2");

        t1.start();
        t2.start();
    }
}
