package examples;

public class StringFindingIndexGivenString {
    public static void main(String[] args) {
        // indexOf() finds and returns index of first occurrence of specified character in this String
        // indexOf() cares and counts white spaces
        String txt = "Where is my key !!!! This is my key !!!";
        System.out.println(txt.indexOf("key"));
    }
}
