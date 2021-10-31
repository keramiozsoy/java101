package examples;

public class VariableTypeConvertion {

    public static void main(String[] args) {

        //32 Bit
        int counter = 40_000_000;

        // int to short (data loss)
        //16 Bit
        short shortCounter = (short) counter;

        // int to long (no data loss)
        //64 Bit
        long longCounter = counter;

        System.out.println(counter);            //30000000
        System.out.println(shortCounter);       //11520
        System.out.println(longCounter);        //30000000


    }
}

