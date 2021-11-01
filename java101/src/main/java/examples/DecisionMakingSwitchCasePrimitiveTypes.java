package examples;

public class DecisionMakingSwitchCasePrimitiveTypes {

    public static void main(String[] args) {

        // The value of the case section have to Value. ( final )
        byte switchByte = 20;
        final byte firstByte = 10;
        final byte secondByte = 20;

        switch (switchByte){
            case firstByte: System.out.println("first");
            break;
            case secondByte: System.out.println("second");
            break;
        }


////////////////////////////////////////////////////////////////////////////////////////////////////



        short switchShort = 40;
        final short firstShort = 30;
        final short secondShort = 40;

        switch (switchShort){
            case firstShort: System.out.println("first");
                break;
            case secondShort: System.out.println("second");
                break;
        }
        // It is same example like above, but
        // we have used directly numbers (30,40)
        // Switch will understand automatically
        switch (switchShort){
            case 30: System.out.println("first");
                break;
            case 40: System.out.println("second");
                break;
        }



////////////////////////////////////////////////////////////////////////////////////////////////////

        char switchChar = 66; // Ascii

        switch (switchChar){
            case 'A': System.out.println("first");
                break;
            case 'B': System.out.println("second");
                break;
        }


////////////////////////////////////////////////////////////////////////////////////////////////////


        int switchInt = 20;

        switch (switchInt){
            case 10: System.out.println("first");
                break;
            case 20: System.out.println("second");
                break;
        }


////////////////////////////////////////////////////////////////////////////////////////////////////






    }


}
