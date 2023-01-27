package practice01_advance;

import java.util.Scanner;

public class Q02_Substring_AdSoyad {
    public static void main(String[] args) {

        /*
        Kullanicidan tek seferde alacaginiz 2 kelimelik ad soadi 2 ayri kelimeye ayiriniz,
        ad ayri soyad ayri sekilde ekrana yazdiriniz.
        Orn:
        Ad: Ali
        Soyad: Can
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Ad ve soyadinizi aralarinda bir bosluk olacak sekilde giriniz.");
        String adSoyad = input.nextLine();
        String ad = adSoyad.substring(0,adSoyad.indexOf(" "));
        String soyAd = adSoyad.substring(adSoyad.indexOf(" ")+1);

        System.out.println("Ad: "+ad);
        System.out.println("Soyad: "+soyAd);




    }
}
