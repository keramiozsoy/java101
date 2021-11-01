package examples;

public class DecisionMakingSwitchCasePrimitiveAndWrapperTypes {

    public static void main(String[] args) {

        // The value of the case section have to non-changeable. ( final )
        byte switchByte = 20;
        final byte firstByte = 10;
        final byte secondByte = 20;

        switch (switchByte){
            case firstByte: System.out.println("first");

            case secondByte: System.out.println("second");
        }


////////////////////////////////////////////////////////////////////////////////////////////////////



        short switchShort = 40;
        final short firstShort = 30;
        final short secondShort = 40;

        switch (switchShort){
            case firstShort: System.out.println("first");

            case secondShort: System.out.println("second");
        }
        // It is same example like above, but
        // we have used directly numbers (30,40)
        // Switch will understand automatically
        switch (switchShort){
            case 30: System.out.println("first");

            case 40: System.out.println("second");
        }



////////////////////////////////////////////////////////////////////////////////////////////////////

        char switchChar = 66; // Ascii

        switch (switchChar){
            case 'A': System.out.println("first");

            case 'B': System.out.println("second");
        }


////////////////////////////////////////////////////////////////////////////////////////////////////


        int switchInt = 20;

        switch (switchInt){
            case 10: System.out.println("first");

            case 20: System.out.println("second");
        }

////////////////////////////////////////////////////////////////////////////////////////////////////

        // wrapper
        Integer switchIntegerWrapper = 20;

        switch (switchIntegerWrapper){
            case 10: System.out.println("first");

            case 20: System.out.println("second");
        }


////////////////////////////////////////////////////////////////////////////////////////////////////

        PizzaSizeEnum selectedPizzaSize = PizzaSizeEnum.MEDIUM;

        switch(selectedPizzaSize) {
            case SMALL:
                System.out.println("first - I ordered a small size pizza.");

            case MEDIUM:
                System.out.println("second - I ordered a medium size pizza.");
        }


    }


}
