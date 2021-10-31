package examples;

public class VariableAssignSameObject {

    public static void main(String[] args) {
        String str1;
        String str2;

        // Assigns the reference of a String object "Hello" to str1
        str1 = new String( "Hello World" );

        // Assigns the reference stored in str1 to str2
        str2 = str1;

        System.out.println( str1 );         //Hello World !!
        System.out.println( str2 );         //Hello World !!
    }
}

