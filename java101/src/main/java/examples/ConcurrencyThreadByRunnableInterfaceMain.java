package examples;

public class ConcurrencyThreadByRunnableInterfaceMain {
    public static void main(String[] args) {

        int allBoxCount = 100;
        int workerBox =  30;
        int remainBox = allBoxCount - workerBox;

        ConcurrencyThreadByRunnableWorker worker1 = new ConcurrencyThreadByRunnableWorker(1,workerBox);
        ConcurrencyThreadByRunnableWorker worker2 = new ConcurrencyThreadByRunnableWorker(2,remainBox);

        Thread t1 = new Thread(worker1, "T1");
        Thread t2 = new Thread(worker2, "T2");

        t1.start();
        t2.start();
    }
}
