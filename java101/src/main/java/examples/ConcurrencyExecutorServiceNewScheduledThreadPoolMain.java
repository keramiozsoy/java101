package examples;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ConcurrencyExecutorServiceNewScheduledThreadPoolMain {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(10);
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello " + Thread.currentThread().getName());
            }
        }, 10, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();
    }
}
