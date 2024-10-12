package examples;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyExecutorServiceNewCachedThreadPoolMain {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

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
