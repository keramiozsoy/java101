package examples;

import java.util.concurrent.*;

public class ConcurrencyExecutorServiceFutureCallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                return "Hello" + Thread.currentThread().getName();
            }
        });
        System.out.println(future.get());
        executorService.shutdown();
    }

}
