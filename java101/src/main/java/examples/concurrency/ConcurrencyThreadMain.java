package examples.concurrency;

public class ConcurrencyThreadMain {
    public static void main(String[] args) {

        ConcurrencyThreadWorker worker = new ConcurrencyThreadWorker();
        ConcurrencyThreadWorker worker2 = new ConcurrencyThreadWorker();

        worker.start();
        worker2.start();
    }
}
