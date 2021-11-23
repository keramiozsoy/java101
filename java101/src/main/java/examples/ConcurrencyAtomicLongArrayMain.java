package examples;

import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;

public class ConcurrencyAtomicLongArrayMain {
    public static void main(String[] args) {
        System.out.println("========1======");
        AtomicLongArray ale1 = new AtomicLongArray(5);
        System.out.println(ale1);

        System.out.println("========2======");

        long[] longs = new long[5];
        longs[1] = 1;
        longs[4] = 4;
        AtomicLongArray ale2 = new AtomicLongArray(longs);
        System.out.println(ale2);


        System.out.println("========3======");
        AtomicLongArray ale3 = new AtomicLongArray(5);
        // add [1] = 1
        ale3.addAndGet(1,1);
        // [1] = 2
        ale3.incrementAndGet(1);

        System.out.println(ale3);
    }
}
