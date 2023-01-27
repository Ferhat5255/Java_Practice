package practice06_advance;

import java.util.Scanner;

public class Q02_RastgeleSifreOlusturma {

    //Kullanicidan aldiginiz sayi kadar karakter uzunluguna sahip rastgele sifre ureten bir kod yaziniz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Karakter sayisini giriniz");
        int karakterSayisi = input.nextInt();

        String sifre = "";
        int sayac = 0;

        String karakterler = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuv0123456789";
        int maxIndex = karakterler.length();

        while (sayac < karakterSayisi) {
            int rastgeleIndex = (int) (Math.random() * maxIndex);
            sifre += karakterler.charAt(rastgeleIndex);

            sayac++;

        }
        System.out.println("Sifre = " + sifre);


    }

}
