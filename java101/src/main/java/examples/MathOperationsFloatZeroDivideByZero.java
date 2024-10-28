package examples;

public class MathOperationsFloatZeroDivideByZero {

    public static void main(String[] args) {
        // It returns NaN ( Not a Number )
        // which is not an exception.
        // it is answer.
        float a = 0;
        float b = 0;
        float c = a / b;

        System.out.println(c);
    }
}
