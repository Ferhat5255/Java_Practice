package practice08_advance;

import java.util.Scanner;

public class Q03_StringRakamlarToplami {
    /*
    Kullanicidan alinan bir Srtring icerisindeki rakamlarin toplamini hesaplayan bir method yaziniz.
    Orn:
    Input : J4\/4 N1$ 34$#
    output : 16

    Ipucu :

    Character.isDigit()
    Integer.valueOf()
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir String giriniz");
        String str = input.nextLine();
rakamlarToplami(str);

    }

    static void rakamlarToplami(String str) {

        int toplam = 0;

        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {

                toplam += Integer.valueOf("" + str.charAt(i));
            }
        }
        System.out.println("Rakamlar toplami : " + toplam);


    }
}
