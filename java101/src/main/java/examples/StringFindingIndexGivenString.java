package examples;

public class StringFindingIndexGivenString {
    public static void main(String[] args) {
        // indexOf will return first match index of position
        // it will count white space
        String txt = "Where is my key !!!! This is my key !!!";
        System.out.println(txt.indexOf("key"));
    }
}
