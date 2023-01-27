package day09_nestedforloop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {


   /*
   Kullanicidan toplanmak uzere sayilar isteyin
   Sayi adedi 10'u gecerse ya da toplami 500 'u gecerse
   "Bu kadar sayi yeter   ...adet sayi girdiniz toplami..."
    */

        Scanner input = new Scanner(System.in);


        int sayi =0;
        int toplam =0;
        int sayac =0;

        while (sayac<11 && toplam<500) {
            System.out.println("Lutfen toplanmak uzere sayi giriniz...");
            sayi = input.nextInt();
            toplam += sayi;
            sayac++;
        }

            if(toplam>500){
                System.out.println(sayac+ " adet sayi girdiniz. Toplami" +toplam);
            }else
                System.out.println("bu kadar sayi yeter. " + sayac+ " adet sayi girdiniz. Toplami " + toplam );


//*******************//ODEVV//**********************************



//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6

//Bu sekli konsolda yazdiriniz












    }
}
