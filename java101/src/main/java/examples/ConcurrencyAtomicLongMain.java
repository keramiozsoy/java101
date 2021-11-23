package examples;

import java.util.concurrent.atomic.AtomicLong;

public class ConcurrencyAtomicLongMain {
    public static void main(String[] args) {
        System.out.println("========1======");
        AtomicLong al1 = new AtomicLong();
        System.out.println(al1);

        System.out.println("========2======");
        AtomicLong al2 = new AtomicLong(10);
        System.out.println(al2);


        System.out.println("========3======");
        AtomicLong al3 = new AtomicLong(20);
        final long alInitLastValueOfMemory = al3.get();

        // It will set last value of memory
        al3.set(30);

        System.out.println(alInitLastValueOfMemory);
        System.out.println(al3.get());


        System.out.println("========4======");
        // getAndSet -> first it takes value after set value
        AtomicLong al4 = new AtomicLong(40);
        final long resultGetAndSet = al4.getAndSet(50);
        System.out.println(resultGetAndSet);


        System.out.println("========5======");
        // compareAndSet (thread-safe)
        //                 -> It compares the current value and expected value
        //               -> if two values are equal sets value of updateWithThisValue
        AtomicLong al5 = new AtomicLong(60);
        int expectedValue = 60;
        int updateWithThisValue = 80;
        final boolean b = al5.compareAndSet(expectedValue, updateWithThisValue);
        System.out.println(b);
        System.out.println(al5.get());


        System.out.println("========6======");
        AtomicLong al6 = new AtomicLong();
        final long andAdd = al6.getAndAdd(1);
        System.out.println(andAdd);
        final long i = al6.addAndGet(2);
        System.out.println(i);
        final long andIncrement = al6.getAndIncrement();
        System.out.println(andIncrement);
        final long i1 = al6.incrementAndGet();
        System.out.println(i1);

    }
}
