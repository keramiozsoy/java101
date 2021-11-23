package examples;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class ConcurrencyAtomicIntegerMain {
    public static void main(String[] args) {
        System.out.println("========1======");
        AtomicInteger ai1 = new AtomicInteger();
        System.out.println(ai1);

        System.out.println("========2======");
        AtomicInteger ai2 = new AtomicInteger(10);
        System.out.println(ai2);


        System.out.println("========3======");
        AtomicInteger ai3 = new AtomicInteger(20);
        final int abInitLastValueOfMemory = ai3.get();

        // It will set last value of memory
        ai3.set(30);

        System.out.println(abInitLastValueOfMemory);
        System.out.println(ai3.get());


        System.out.println("========4======");
        // getAndSet -> first it takes value after set value
        AtomicInteger ai4 = new AtomicInteger(40);
        final int resultGetAndSet = ai4.getAndSet(50);
        System.out.println(resultGetAndSet);


        System.out.println("========5======");
        // compareAndSet (thread-safe)
        //                 -> It compares the current value and expected value
        //               -> if two values are equal sets value of updateWithThisValue
        AtomicInteger ai5 = new AtomicInteger(60);
        int expectedValue = 60;
        int updateWithThisValue = 80;
        final boolean b = ai5.compareAndSet(expectedValue, updateWithThisValue);
        System.out.println(b);
        System.out.println(ai5.get());


        System.out.println("========6======");
        AtomicInteger ai6 = new AtomicInteger();
        final int andAdd = ai6.getAndAdd(1);
        System.out.println(andAdd);
        final int i = ai6.addAndGet(2);
        System.out.println(i);
        final int andIncrement = ai6.getAndIncrement();
        System.out.println(andIncrement);
        final int i1 = ai6.incrementAndGet();
        System.out.println(i1);

    }
}
