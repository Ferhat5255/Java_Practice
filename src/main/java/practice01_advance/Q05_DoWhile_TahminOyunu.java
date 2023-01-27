package practice01_advance;

import java.util.Scanner;

public class Q05_DoWhile_TahminOyunu {
    public static void main(String[] args) {

        //0 ile 100 arasinda rastgele numara tahmini yapan bir kod yaziniz
        //Ipucu: Girdiginiz numara rastgeleNumara 'dan kucukse ==> Daha buyuk bir numara giriniz
        //      Girdiginiz numara rastgeleNumara 'dan buyukse ==> Daha kucuk bir numara giriniz'
        //      Girdiginiz numara rastgeleNumara 'ya esitse ==>Tebrikler!!!


        Scanner input = new Scanner(System.in);

        int sayi;

        int rastgeleSayi = (int) (Math.random() * 100) + 1;

        int sayac =0;



        do {
            System.out.println("1-100 arasi bir sayi tahmini giriniz");
            sayac++;

            sayi = input.nextInt();
            if (sayi == rastgeleSayi) {
                System.out.println("Tebrikler!!");
            } else if (sayi < rastgeleSayi) {
                System.out.println("Daha buyuk bir sayi giriniz");
            } else {
                System.out.println("Daha kucuk bir sayi giriniz");
            }
            if (sayac ==10){
                System.out.println("Hakkiniz bitti oyunu kaybettiniz.");
                break;
            }
            System.out.println(10-sayac+ " hakkiniz kaldi!");
        } while (sayi != rastgeleSayi);





    }
}
