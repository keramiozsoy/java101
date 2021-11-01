package examples;

import java.util.Random;
import java.util.Scanner;

public class LoopWhileRandomNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number between 1 and 5");

        Random r = new Random();
        int realNumber = r.nextInt(5) + 1;

        while (true){
            int predictNumber = scanner.nextInt();

            if ( predictNumber == realNumber ){
                System.out.println(" Correct ");
                break;
            }

            System.out.println(" Try again later !!! ");
        }

    }
}
