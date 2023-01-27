package practice05_advance;

import java.util.Scanner;

public class Q02_Nested_For_Ucgen {

    /*
    Kullanicidan aldiginiz satir sdayisina gore asagidaki sekli yazdiran bir kod yaziniz.

                *
               * *
              * * *
             * * * *
            * * * * *
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Satir sayisini giriniz");
        int satir = input.nextInt();


        for (int i = 0; i < satir; i++) {  //satir kontrolu
            for (int bosluk = satir - i; bosluk > 1; bosluk--) {

                System.out.print(" ");
            }
            for (int yildiz = 0; yildiz <= i; yildiz++) {

                System.out.print("* ");
            }
            System.out.println();


        }


    }
}

