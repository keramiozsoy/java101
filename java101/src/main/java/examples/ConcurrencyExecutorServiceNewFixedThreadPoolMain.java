package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyExecutorServiceNewFixedThreadPoolMain {
    public static void main(String[] args) {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        System.out.println(" count of availableProcessors " + availableProcessors);
        ExecutorService executorService = Executors.newFixedThreadPool(availableProcessors);

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
