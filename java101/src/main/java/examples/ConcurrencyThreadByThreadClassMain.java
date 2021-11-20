package examples;

public class ConcurrencyThreadByThreadClassMain {
    public static void main(String[] args) {

        int allBoxCount = 100;
        int workerBox =  30;
        int remainBox = allBoxCount - workerBox;

        ConcurrencyThreadByThreadClassWorker worker = new ConcurrencyThreadByThreadClassWorker(1, workerBox);
        ConcurrencyThreadByThreadClassWorker worker2 = new ConcurrencyThreadByThreadClassWorker(1, remainBox);

        System.out.println(" I am sharing tasks with workers ");
        worker.start();
        worker2.start();
        System.out.println(" I have just shared, I am waiting results ");
        System.out.println(" I am doing my task");
    }
}
