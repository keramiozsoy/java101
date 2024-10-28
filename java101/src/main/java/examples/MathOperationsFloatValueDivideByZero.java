package examples;

public class MathOperationsFloatValueDivideByZero {

    public static void main(String[] args) {
        // It returns  Infinity,
        // which is not an exception.
        // it is an answer.
        float a = 5;
        float b = 0;
        float c = a / b;

        System.out.println(c);

        float aa = -5;
        float bb = 0;
        float cc = aa / bb;

        System.out.println(cc);

    }
}
