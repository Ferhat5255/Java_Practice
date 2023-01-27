package day02_variables;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

//        //  Soru 1)   Kullanicinin  girdigi 4 basamakli sayinin ilk ve son rakaminin toplamini ekrana yazdiran programi yazdiriniz
//
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Lutfen dort basamakli bir sayi giriniz:");
//        int sayi = scanner1.nextInt();
//
//
//        // bir sayinin birler basamagindaki %10 ile hesaplatabiliriz
//
//        int sonRakam = sayi%10;
//        int ilkRakam = sayi/1000;
//        System.out.println("ilkRakam+sonRakam=" + (ilkRakam+sonRakam));


//
//
//        //  Soru 2) Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin//853

//        Scanner input1 =new Scanner(System.in);
//        System.out.println("Uc basamakli bir sayi giriniz=");
//
//        int sayi = input1.nextInt();
//
//        // 1) 1 ler basamagindaki sayiyi bulun
//
//        int birler = sayi % 10;
//        System.out.println("birler basamagi "+ birler);  //2
//
//        //sayi=sayi /10
//        sayi /= 10 ;
//        System.out.println("ikiBas="+sayi);  //85
//
//        // 2) 10 lar basamagindaki sayiyi bulun
//
//        int onlar = sayi%10;
//        System.out.println("onlar basamagi " + onlar); //5
//
//        sayi=sayi/10;
//
//        // 3) 100 ler basamagindaki sayiyi bulun
//        int yuzler = sayi;
//        System.out.println("girdiginiz sayinin yuzler basamagi " + yuzler);





//


        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Lutfen 5 basamakli bir sayi giriniz=");
//
//         String sayi5= scan.next();
//
//        char ilk = sayi5.charAt(0);
//        System.out.println("ilk="+ilk);
//
//        char ikinci = sayi5.charAt(1);
//        System.out.println("ikinci "+ikinci);
//
//        char dorduncu = sayi5.charAt(3);
//        System.out.println("dorduncu "+ dorduncu);
//
//        char besinci = sayi5.charAt(4);
//        System.out.println("besinci "+ besinci);
//
//        int toplam= ilk+ikinci+ dorduncu+besinci;
//        System.out.println("" +toplam);

        //  Soru 3) Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son 2 basamagindaki rakamlarin toplamini bulunuz
        //         *   Ex :
        //         *   input  : 12345==>1+2+4+5=12
        //         *   output : 12


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sayi giriniz");

        int num = input.nextInt();
        int ilkIkiRkm = num/1000;
        System.out.println("ilkIkirkm=" +ilkIkiRkm);  //12



        int ilkIkiTop = (ilkIkiRkm%10)+(ilkIkiRkm/10);  //2+1
        System.out.println("ilkIkiTop=" +ilkIkiTop);  //3

        int sonIkiRkm = num%100;
        System.out.println("sonIkiRkm= " +sonIkiRkm);

        int sonIkiTop = (sonIkiRkm%10)+ (sonIkiRkm/10);  //5+4
        System.out.println("sonIkiTop = " + sonIkiTop);


        int toplam=ilkIkiTop+sonIkiTop;
        System.out.println("toplam = " + toplam);




    }
}
