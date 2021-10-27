package examples;


public class ValueAssignToVariable {

    // Declaring variables and assignment
    public static int a = 5;
    public static String javaWorld = "JavaWorld";

    // Only Declaring variable
    public static int b;

    public static void main(String[] args) {
        // Variable was initialized by default value
        System.out.println(b);

        // Assignment variable
        b = 7;

        System.out.println(a);
        System.out.println(b);
        System.out.println(javaWorld);
    }
}
