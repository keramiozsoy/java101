package examples;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.function.IntUnaryOperator;

public class ConcurrencyAtomicIntegerArrayMain {
    public static void main(String[] args) {
        System.out.println("========1======");
        AtomicIntegerArray aie1 = new AtomicIntegerArray(5);
        System.out.println(aie1);

        System.out.println("========2======");

        int[] ints = new int[5];
        ints[1] = 1;
        ints[4] = 4;
        AtomicIntegerArray aie2 = new AtomicIntegerArray(ints);
        System.out.println(aie2);


        System.out.println("========3======");
        AtomicIntegerArray aie3 = new AtomicIntegerArray(5);
        // add [1] = 1
        aie3.addAndGet(1,1);
        // [1] = 2
        aie3.incrementAndGet(1);

        System.out.println(aie3);
    }
}
