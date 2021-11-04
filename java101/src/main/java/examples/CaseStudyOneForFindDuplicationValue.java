package examples;

public class CaseStudyOneForFindDuplicationValue {
    public static void main(String[] args) {
        int[] intArray = { 7, 9, 5, 5, 1, 3 };

        // Tekrar eden sayiyi ekrana yazan kod parcasini ekleyiniz.
        // Kurallar
        // Sadece verilen patterne uygun calismasi yeterli
        // bulduktan sonra dizinin devamini kontrol etmeye gerek yok

        for(int i = intArray.length - 1 ; i >= 0; i--){
             System.out.println(intArray[i]);

            /*
            if ( intArray[i] == intArray[i-1]){
                System.out.println(intArray[i]);
                break;
            }

             */

        }

    }
}
