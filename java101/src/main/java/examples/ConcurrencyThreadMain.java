package examples;

public class ConcurrencyThreadMain {
    public static void main(String[] args) {

        int allBoxCount = 100;
        int workerBox =  30;
        int remainBox = allBoxCount - workerBox;

        ConcurrencyThreadWorker worker = new ConcurrencyThreadWorker(1, workerBox);
        ConcurrencyThreadWorker worker2 = new ConcurrencyThreadWorker(1, remainBox);

        System.out.println(" I am sharing tasks with workers ");
        worker.start();
        worker2.start();
        System.out.println(" I have just shared, I am waiting results ");
        System.out.println(" I am doing my task");
    }
}
