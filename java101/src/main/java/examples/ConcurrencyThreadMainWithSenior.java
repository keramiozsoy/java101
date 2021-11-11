package examples;

public class ConcurrencyThreadMainWithSenior {
    public static void main(String[] args) {

        ConcurrencyThreadWorker worker = new ConcurrencyThreadWorker();
        ConcurrencyThreadSeniorWorker seniorWorker = new ConcurrencyThreadSeniorWorker();

        worker.start();
        seniorWorker.start();
    }
}
