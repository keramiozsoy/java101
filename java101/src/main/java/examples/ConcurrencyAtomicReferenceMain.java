package examples;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.IntBinaryOperator;

public class ConcurrencyAtomicReferenceMain {
    public static void main(String[] args) {
        System.out.println("========1======");
        AtomicReference ar1 = new AtomicReference();
        System.out.println(ar1);

        System.out.println("========2======");
        AtomicReference ar2Str = new AtomicReference("this is string");
        System.out.println(ar2Str);
        AtomicReference ar2Int = new AtomicReference(1);
        System.out.println(ar2Int);
        AtomicReference ar2Bool = new AtomicReference(true);
        System.out.println(ar2Bool);
        AtomicReference ar2Double = new AtomicReference(20.99);
        System.out.println(ar2Double);
        AtomicReference ar2fFloat = new AtomicReference(20.99F);
        System.out.println(ar2fFloat);
        AtomicReference ar2Obj = new AtomicReference(new Object());
        System.out.println(ar2Obj);

        System.out.println("========3======");
        // You can use Java generics
        AtomicReference<String> ar3 = new AtomicReference<>();
        System.out.println(ar3);



    }
}
