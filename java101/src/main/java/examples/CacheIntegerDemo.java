package examples;

public class CacheIntegerDemo {

    public static void main(String[] args) {

        Integer a1 = 100;
        Integer a2 = 100;
        Integer a3 = new Integer(100);

        Integer aaa = Integer.valueOf(3);
        Integer bbb = Integer.valueOf(3);

        System.out.println(a1 == a2); // true
        System.out.println(a1 == a3); // false

        System.out.println(aaa == bbb);
    }

}
