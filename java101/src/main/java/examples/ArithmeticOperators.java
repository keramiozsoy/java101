package examples;

public class ArithmeticOperators {


    public static void main(String[] args) {
        // Declaring variables
        int num1 = 10, num2 = 20, result = 0;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("-----------------");

        // adding num1 and num2
        result = num1 + num2;
        System.out.println("Sum = " + result);

////////////////////////////////////////////////////////////////////////////////////////////////////

        // subtracting num1 and num2
        result = num1 - num2;
        System.out.println("Subtraction = " + result);


////////////////////////////////////////////////////////////////////////////////////////////////////

        // Multiplying num1 and num2
        result = num1 * num2;
        System.out.println("Multiplication = " + result);


////////////////////////////////////////////////////////////////////////////////////////////////////

        // Dividing num1 and num2
        result = num1 / num2;
        System.out.println("Division = " + result);


////////////////////////////////////////////////////////////////////////////////////////////////////

        // Declaring again variables
        num1 = 7;
        num2 = 2;
        result = 0;

        System.out.println("-----------------");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("-----------------");


        // Remaindering num1 and num2
        result = num1 % num2;
        System.out.println("Remainder = " + result);


////////////////////////////////////////////////////////////////////////////////////////////////////

        // initializing variables
        int num = 5;
        System.out.println("-----------------");
        System.out.println("num = " + num);
        System.out.println("-----------------");

        // first 5 gets printed and then
        // increment to 6
        System.out.println("Post increment = " + num++);

        // num was 6, incremented to 7
        // then printed
        System.out.println("Pre  increment = " + ++num);

////////////////////////////////////////////////////////////////////////////////////////////////////

        // initializing variables
        num = 5;
        System.out.println("-----------------");
        System.out.println("num = " + num);
        System.out.println("-----------------");

        // first 5 gets printed and then
        // decremented to 4
        System.out.println("Post  decrement = " + num--);

        System.out.println("num = " + num);

        // num was 4, decremented to 3
        // then printed
        System.out.println("Pre  decrement = " + --num);

    }

}
