package examples;

public class MathOperationsDivideByZero {

    public static void main(String[] args) {


        // ArithmeticException: / by zero
        int a = 5;
        int b = 0;
        int c = a / b;

        System.out.println(c);

    }
}
