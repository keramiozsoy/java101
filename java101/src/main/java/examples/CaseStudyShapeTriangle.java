package examples;

import java.util.Arrays;
import java.util.Scanner;

public class CaseStudyShapeTriangle {

//x x x #
//x x ##
//x ###
//####

// x = 10
//90831667
//33205333
//636542

// x = 100
//87641625
//33983583
//624792

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("x = ");
        int x = Integer.parseInt(scanner.nextLine());
// solution first
        // 4

        long beginFirst = System.nanoTime();
        for (int k=1; k<=x; k++){
            for(int i = x - k; i > 0 ; i-- ){
                System.out.print("-");
            }
            for(int j = 1; j <= k ; j++){
                System.out.print("#");
            }
            System.out.println();
        }
        long endFirst = System.nanoTime();
        System.out.println(endFirst - beginFirst);

        // solution second
        long beginSecond = System.nanoTime();
        int i, j, n=x;
        for(i=0; i<n; i++)
        {
            for(j=2*(n-i); j>=0; j--)
            {
                System.out.print("-");
            }
            for(j=0; j<=i; j++)
            {
                System.out.print("# ");
            }
            System.out.println();
        }
        long endSecond = System.nanoTime();
        System.out.println(endSecond - beginSecond);

        long beginThird = System.nanoTime();

        char[] chr = new char[x];
        Arrays.fill(chr, ' ');
        for(int d = x-1; d>=0; d--){
            chr[d] = '#';
            System.out.println(new String(String.valueOf(chr)));
        }
        long endThird = System.nanoTime();
        System.out.println(endThird - beginThird);


    }


}
