package practice02_advance;

import java.util.Scanner;

public class Q02_For_Continue {
    public static void main(String[] args) {
/*
Kullanicidan 5 adet sayi isteyiniz
Bu sayilardan 5 ile 10 arasindakilaer haric, digerlerinin toplamini bulunuz
 */


        Scanner input = new Scanner(System.in);

        int toplam =0;
        for(int i =0; i<5; i++) {
            System.out.println("Bir sayi giriniz");
            int sayi = input.nextInt();

            if(sayi>5 && sayi<10) {
                System.out.println("Girdiginiz sayi 5 ila 10 arasinda oldugundan isleme alinmamistir");
                continue;
            }
            toplam +=sayi;
        }
        System.out.println("toplam = " + toplam);





    }

}
