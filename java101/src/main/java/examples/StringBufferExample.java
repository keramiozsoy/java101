package examples;

public class StringBufferExample {
    public static void main(String[] args) {

        // it reserves empty space which is 16 characters
        StringBuffer sb = new StringBuffer();
        System.out.println("capacity " +  sb.capacity());

        StringBuffer sbFifty = new StringBuffer(50);
        System.out.println("capacity " +  sbFifty.capacity());


        StringBuffer sBHelloWorld = new StringBuffer("Hello World");
        System.out.println("capacity " +  sBHelloWorld.capacity());

        // length
        System.out.println("length " +  sBHelloWorld.length());


///////////////////////////////////////////////////////////////////////////////////////////

        // Append method provide to add String at the end of the exising String Buffer
        StringBuffer sbAp = new StringBuffer("   Hello  ");

        sbAp.append("   World   ");
        sbAp.append(2021);

        System.out.println(sbAp);


///////////////////////////////////////////////////////////////////////////////////////////

        StringBuffer sbIns = new StringBuffer("HelloWorld ");

        // first param is index (int)
        // second param will add String
        sbIns.insert(5, "===");

        sbIns.insert(sbIns.length(), 2021);

        System.out.println(sbIns);


///////////////////////////////////////////////////////////////////////////////////////////


        StringBuffer sbRev = new StringBuffer("Hello World");

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



        StringBuffer sbDelete = new StringBuffer("Hello World");

        // it will delete by given start and end index.
        System.out.println(sbDelete.delete(5,11)); // Print Hello

        System.out.println(sbDelete.deleteCharAt(1));


///////////////////////////////////////////////////////////////////////////////////////////

        StringBuffer sbRep = new StringBuffer("Hello World!");

        System.out.println(sbRep.replace(0,5,"Bye Bye"));


    }
}
