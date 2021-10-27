package examples;

public class LogicalOperators {

    public static void main(String[] args) {
        int numFirst = 90;
        int numSecond = 10;

        System.out.println(" ( numFirst == numSecond ) && ( numFirst > numSecond ) ");
        System.out.println( ( numFirst == numSecond ) && ( numFirst > numSecond ) );

        System.out.println(" ( numFirst == numSecond ) || ( numFirst > numSecond ) ");
        System.out.println( ( numFirst == numSecond ) || ( numFirst > numSecond ) );

        System.out.println(" ( numFirst == numSecond ) ^ ( numFirst > numSecond ) ");
        System.out.println( ( numFirst == numSecond ) ^ ( numFirst > numSecond ) );

        System.out.println(" ( numFirst == numSecond ) != ( numFirst > numSecond ) ");
        System.out.println( ( numFirst == numSecond ) != ( numFirst > numSecond ) );

    }
}
