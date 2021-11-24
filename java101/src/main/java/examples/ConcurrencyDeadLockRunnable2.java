package examples;

import java.util.concurrent.locks.Lock;

public class ConcurrencyDeadLockRunnable2 implements Runnable {

    private Lock lock1 = null;
    private Lock lock2 = null;

    public ConcurrencyDeadLockRunnable2(Lock lock1, Lock lock2){
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        String threadName =  Thread.currentThread().getName();

        System.out.println(threadName + " lock1 will lock here");
        lock1.lock();
        System.out.println(threadName + "locked by 1");

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(threadName + " lock2 will lock");
        lock2.lock();
        System.out.println(threadName + "locked by 2");

        //
        //
        //
        //
        System.out.println(" THIS LINE WILL NEVER RUN");
        //
        //
        //
        //

        System.out.println(threadName + " unlocking lock 1");
        lock1.unlock();
        System.out.println(threadName + " unlocking lock 2");
        lock2.unlock();

    }
}
