package examples;

public class CompareOperatorsWrapperClassEquals {

    public static void main(String[] args) {

        Integer numFirst = Integer.valueOf(10);
        Integer numSecond = new Integer(10);
        Integer numThird = numSecond;


        System.out.println("numFirst " + numFirst);
        System.out.println("numSecond " + numSecond);
        System.out.println("-----------------------");

        // Sinif tipindeki degiskenler == ile karsilastirilmaz.
        // == referanslarin karsilastirilmasi islemidir.
        // equals degerlerin karsilastirilmasidir.
        System.out.println(numFirst == numSecond);
        System.out.println(numFirst.equals(numSecond));


        // Sinif tipindeki degiskenler == ile karsilastirilmaz.
        // == referanslarin karsilastirilmasi islemidir.
        // equals degerlerin karsilasitirilmasidir.
        System.out.println(numSecond == numThird);
        System.out.println(numSecond.equals(numThird));

    }

}
