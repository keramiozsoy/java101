package examples;

import java.util.concurrent.atomic.AtomicStampedReference;

public class ConcurrencyAtomicStampedReferenceMain {
    public static void main(String[] args) {
        System.out.println("========1======");
        Object initialRef   = null;
        int    initialStamp = 0;
        AtomicStampedReference asr1 = new AtomicStampedReference(initialRef, initialStamp);
        System.out.println(asr1.getReference());



    }
}
