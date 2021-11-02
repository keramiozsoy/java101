package examples;

public class StringPrimitive {
    public static void main(String[] args) {
        String str1 = "abc";

        char data[] = {'a', 'b', 'c'};
        String str2 = new String(data);

        String str3 = new String("abc");

        // Sinif tipindeki degiskenler == ile karsilastirilmaz.
        // == referanslarin karsilastirilmasi islemidir.
        // equals degerlerin karsilastirilmasidir.


        System.out.println(str1.equals(str2));

        System.out.println(str1.equals(str3));


    }
}
