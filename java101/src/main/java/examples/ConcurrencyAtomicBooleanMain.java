package examples;

import java.util.concurrent.atomic.AtomicBoolean;

public class ConcurrencyAtomicBooleanMain {
    public static void main(String[] args) {
        System.out.println("========1======");
        AtomicBoolean ab1 = new AtomicBoolean();
        System.out.println(ab1);

        System.out.println("========2======");
        AtomicBoolean ab2 = new AtomicBoolean(true);
        System.out.println(ab2);


        System.out.println("========3======");
        AtomicBoolean ab3 = new AtomicBoolean(true);
        final boolean abInitLastValueOfMemory = ab3.get();

        // It will set last value of memory
        ab3.set(false);

        System.out.println(abInitLastValueOfMemory);
        System.out.println(ab3.get());



        System.out.println("========4======");
        // getAndSet -> first it takes value after set value
        AtomicBoolean ab4 = new AtomicBoolean(true);
        final boolean resultGetAndSet = ab4.getAndSet(false);
        System.out.println(resultGetAndSet);
        System.out.println(ab4.get());


        System.out.println("========5======");
        // compareAndSet -> It compares the current value and expected value
        //               -> if two values are equal sets value of updateWithThisValue
        AtomicBoolean ab5 = new AtomicBoolean(true);
        boolean expectedValue = true;
        boolean updateWithThisValue = false;
        final boolean b = ab5.compareAndSet(expectedValue, updateWithThisValue);
        System.out.println(b);
        System.out.println(ab5.get());



    }
}
