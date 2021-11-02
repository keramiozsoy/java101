package examples;

public class StringSubString {
    public static void main(String[] args) {
        String loremText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.";
        // this will give the string from index 0 to 5
        System.out.println(loremText.substring(0,5));

        // this will give the string from index 5 to the end of the string
        System.out.println(loremText.substring(5));
    }
}
