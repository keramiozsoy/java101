package examples;

public class ConcurrencyThreadMain {
    public static void main(String[] args) {

        ConcurrencyThreadWorker worker = new ConcurrencyThreadWorker();
        ConcurrencyThreadWorker worker2 = new ConcurrencyThreadWorker();

        System.out.println(" I am sharing tasks with workers ");
        worker.start();
        worker2.start();
        System.out.println(" I have just shared, I am waiting results ");
        System.out.println(" I am doing my task");
    }
}
