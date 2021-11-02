package examples;

public class StringBuilderExample {
    public static void main(String[] args) {

        // it reserve empty content which is 16 characters
        StringBuilder sb = new StringBuilder();
        System.out.println("capacity " +  sb.capacity());

        StringBuilder sbFifty = new StringBuilder(50);
        System.out.println("capacity " +  sbFifty.capacity());


        StringBuilder sBHelloWorld = new StringBuilder("Hello World");
        System.out.println("capacity " +  sBHelloWorld.capacity());

        // length
        System.out.println("length " +  sBHelloWorld.length());


///////////////////////////////////////////////////////////////////////////////////////////

        // Append method provide to add String at the end of the exising String Buffer
        StringBuilder sbAp = new StringBuilder("   Hello  ");

        sbAp.append("   World   ");
        sbAp.append(2021);

        System.out.println(sbAp);


///////////////////////////////////////////////////////////////////////////////////////////

        StringBuilder sbIns = new StringBuilder("HelloWorld ");

        // first param is index (int)
        // second param will add String
        sbIns.insert(5, "===");

        sbIns.insert(sbIns.length(), 2021);

        System.out.println(sbIns);


///////////////////////////////////////////////////////////////////////////////////////////


        StringBuilder sbRev = new StringBuilder("Hello World");

        System.out.println("Reversed word: " + sbRev.reverse());

        // Reverse by for
        String sbRevLoop = "Hello World";
        char ch;
        String nstr="";

        for (int i=0; i<sbRevLoop.length(); i++)
        {
            ch= sbRevLoop.charAt(i); //extracts each character
            nstr= ch+nstr; //adds each character in front of the existing string
        }
        System.out.println("Reversed word: "+ nstr);




///////////////////////////////////////////////////////////////////////////////////////////



        StringBuilder sbDelete = new StringBuilder("Hello World");

        // it will delete by given start and end index.
        System.out.println(sbDelete.delete(5,11)); // Print Hello

        System.out.println(sbDelete.deleteCharAt(1));


///////////////////////////////////////////////////////////////////////////////////////////

        StringBuilder sbRep = new StringBuilder("Hello World!");

        System.out.println(sbRep.replace(0,5,"Bye Bye"));


    }
}
