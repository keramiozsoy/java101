package examples;

import java.util.Scanner;

public class CaseStudySumOfBetweenNumbers {
    public static void main(String[] args) {
        // Disaridan girilen iki tam sayi (pozitif veya negatif) arasindaki sayilarin toplamini hesaplayan
        // programi yazalim. Girilen sayilar toplama dahil edilmeyecektir.

        // Kurallar:
        // iki sayi da 0 olamaz
        // iki sayi arasindaki fark 1 olamaz.
        // her durum icin programin kullaniciyi uyarmasina gerek yok, calissin yeter.

        int toplam,veri1,veri2;
        do {
            Scanner veriAl = new Scanner(System.in);
            toplam = 0;

            System.out.print("Küçük sayıyı giriniz: ");
            veri1 = veriAl.nextInt();

            System.out.print("Büyük sayıyı giriniz: ");
            veri2 = veriAl.nextInt();

        } while (veri1 >= veri2  ||   Math.abs( veri2 - veri1 ) == 1  || veri1 == 0 || veri2 == 0);

        for (int i = veri1; i <= veri2; i++) {
            toplam += i;
        }

        toplam -=  ( veri1  + veri2 );

        System.out.println("Sayıların toplamı: " + toplam);
        System.exit(0);
    }
}