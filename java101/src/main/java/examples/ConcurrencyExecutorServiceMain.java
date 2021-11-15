package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyExecutorServiceMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        // above line is instead of start()

        for (int i = 1; i <= 5; i++) {
            int count = i;
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName() + " ExecutorService " + count );
                }
            });
        }

        executorService.shutdown();
    }
}
