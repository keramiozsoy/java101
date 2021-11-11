package examples;

public class ConcurrencyThreadMainWithRunnable {
    public static void main(String[] args) {

        ConcurrencyThreadWorkerRunnable worker = new ConcurrencyThreadWorkerRunnable();
        ConcurrencyThreadSeniorWorkerRunnable concurrencyThreadSeniorWorkerRunnable = new ConcurrencyThreadSeniorWorkerRunnable();

        Thread t1 = new Thread(worker, "T1");
        Thread t2 = new Thread(concurrencyThreadSeniorWorkerRunnable, "T2");

        t1.start();
        t2.start();
    }
}
