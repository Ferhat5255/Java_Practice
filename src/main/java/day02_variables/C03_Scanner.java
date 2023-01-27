package day02_variables;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String kullaniciIsmi = input.next();   //nextline

        //Soru 1 ) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplatan bir program yazdirin
            //( CEMBERIN CEVRESI = 2*3.14*r  DAIRENIN ALANI = 3.14*r*r  )

        System.out.println("Lutfen cemberin yari capini giriniz");

        double r = input.nextDouble();
        System.out.println("cemberin cevresi= " + 2*314*r/100);
        System.out.println("dairenin alani= " + 314*r*r/100);

        //Soru 2 )  Kullanicidan bir dikdortgenin uzun ve kisa kenarlarini isteyip o dikdortgenin alan ve
// cevre hesabini yapan bir program yaziniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen dikdortgenin kisa kenarini giriniz=");
        double kisaKenar= input.nextDouble();
        System.out.println("Lutfen uzun kenari giriniz=");
        double uzunKenar = input.nextDouble();
        System.out.println("Dikdortgenin alani=" + kisaKenar*uzunKenar);
        System.out.println("dikdortgenin cevresi=" + 2*(kisaKenar+uzunKenar));

//Soru 3) Kenar uzunluklari kullanicidan alinana bir ucgenin cevresini hesaplayan bir program yaziniz.(byte kullanin)
// Ucgenin cevresi=a+b+c

        Scanner  scan2 = new Scanner(System.in);
        System.out.println("Ucgenin uc kenar uzunlugunu giriniz=");
        byte a = input.nextByte();
        byte b = input.nextByte();
        byte c = input.nextByte();

        int cevre = a+b+c;
        System.out.println("Ucgenin Cevresi= " + cevre);

        // Soru4)   /*Kullanicidan aldiginiz sekille asagidaki gibi bir gorunum olusturan bir kod yaziniz

/*
             A
            A A
           A A A
    */

        System.out.println("       A     ");
        System.out.println("      A A    ");
        System.out.println("     A A A       ");

        Scanner scan4 = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");

        char ch = scan4.next().charAt(0);

        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch);
        System.out.println(ch+" "+ch+" "+ ch);





    }
}
