package examples;

public class StringSubString {
    public static void main(String[] args) {
        String loremText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        // Returns the string starting from index 0 to 5
        System.out.println(loremText.substring(0,5));

        // Returns the string starting from index 5 to the end of the string
        System.out.println(loremText.substring(5));
    }
}
