package examples;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ConcurrencyDeadLockMain {
    public static void main(String[] args) {

        Lock lock1 = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Runnable runnable1 = new ConcurrencyDeadLockRunnable1(lock1, lock2);
        Runnable runnable2 = new ConcurrencyDeadLockRunnable2(lock1, lock2);

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

        thread1.start();
        thread2.start();


    }
}
