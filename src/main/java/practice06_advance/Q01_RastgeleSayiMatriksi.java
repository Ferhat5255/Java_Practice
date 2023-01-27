package practice06_advance;

import java.util.Scanner;

public class Q01_RastgeleSayiMatriksi {
    /*
    Kullanicidan aldiginiz sayi kadar satir ve sutun sayisina sahip alttaki rastgele 0 ve 1 'lerden olusan matriksi yazdirin.

    Input :10

    Output :
    1 0 0 1 1 0 0 0 1 1
    0 0 1 0 1 0 1 0 0 0
    0 1 0 1 0 0 0 0 0 1
    1 1 1 0 0 0 0 1 1 1
    1 1 0 1 1 1 0 1 0 0
    1 0 0 0 1 1 0 0 0 0
    0 0 1 0 0 0 0 1 1 1
    1 1 0 1 0 1 0 0 1 0
    1 1 1 0 0 1 1 1 1 0
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();


        for (int i = 0; i < sayi; i++) {
            for (int j = 0; j < sayi; j++) {
                System.out.print((int) (Math.random() * 2) + " ");
            }
            System.out.println();
        }


    }
}
