package day03_ifstatement;

public class C02_AsciiDegerleri {
    public static void main(String[] args) {



        char harf= 'a';
        char harf2 ='A';

        System.out.println("harf>harf2 ==> " +(harf>harf2)); //true  ksrsilastirma islemlerinin sonucunu  boolean true ya da false doner

        // Buyuk harflerin ASCII Degerleri kucuk harflerin ASCII dgerlerinden daha kucuktur

        // 1) Gerhangi bir char variable'in ascii degerlerini kod yazarak bulubuz

        //1.yol
        char space= ' ';
        System.out.println("Space'in ASCII degeri : " + (space+0));  //  32 space'in ASCII degerini hesaplamak icin toplamaya etkisi olmayan '0' i
                                                                        // seceriz. Boylece yazdirdigimiz deger bize space 'in degerini verir

        char f = 'f';
        System.out.println("f'nin ASCII degeri : " + (f+0));   //102

        // 2.yol

        // char'larda Java char jaarktere int ' da atayabiliriz.
        // Cunku  char'in bir resim karakteri bir de matematiksel ASCII degeri vardir
        // bu nedenle ASCII degerlerini hesaplayabiliriz


        int harf3 = 'f';
        System.out.println("f'nin ASCII degeri: "+ harf3);


        byte b1 = 12;
        byte b2 = -125;

        System.out.println("b1>b2 ==>  " + (b1>b2));

        float f1 = 2.45645f;
        float f2 = 5.86786f;

        System.out.println("f1>f2 ==> "+ (f1>f2));  //false
        System.out.println("b1>f1 ==>  " + (b1>f2));  //true

        long lng1= 5456456464L;
        System.out.println("b1<lng1 ==> " + (b1<lng1));

        char ch ='h';

        System.out.println("b1>ch ==>" + (b1>ch)); //false







    }
}
