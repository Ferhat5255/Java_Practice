package practice05_advance;

import java.util.Scanner;

public class Q01_Ascii {
    //Kullanicidan aldiginiz iki karakterin arasinda bulunan tum karakterleri yazdiran bir kod yaziniz.
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
        System.out.println("Ilk karakteri giriniz");
        char ch1 = input.next().charAt(0);
        System.out.println("Ikinci karakteri giriniz");
        char ch2 = input.next().charAt(0);

        int ilk = Math.min(ch1,ch2);
        int son=   Math.max(ch1,ch2);

        for (int i =ilk+1; i < son; i++) {
            System.out.print((char)i + ",");

        }

    }
}

