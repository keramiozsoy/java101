package examples;

public class CaseStudySwapValuesWithoutTemporaryValue {
    public static void main(String[] args) {

        // Iki tane integer sayi tanimlayiniz ve ilk degerlerini atayiniz.
        // 3. bir degisken tanimlamadan, iki degiskenin degerlerini degistirip yazdiriniz.

        int a = 10;
        int b = 5;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a); // it will print first initialized value of b
        System.out.println(b); // it will print first initialized value of b

    }
}
