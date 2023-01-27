package practice02_advance;

import java.util.Scanner;

public class Q01_If_Diskriminant {
    public static void main(String[] args) {


        /*
        Katsayilari verilen 1 bilinmeyenli denklemin koklerini bulunuz

        ax^2 + bx +c ;

        Cozum adimlari
        Kullanicidan a,b,c yi alin.
        Diskriminant formulu: (-b +/- karakok(delta)) / (2a)
        Delta = bb-4ac
        Delta > 0 ==> 2 tane kok vardir  x1=(-b + kok(d)) / (2a)  ,  x2= (-b - kok(d)) / (2*a)
        Delta =0 ==> 1 tane kok vardir  x = -b/2a
        Delta <0 ise kok yoktur.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Denklemin a,b ve c sayilarini sirayla giriniz");
        double a = input.nextInt();
        double b = input.nextInt();
        double c = input.nextInt();

        double delta= b*b-4*a*c;

        if (delta>0) {
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            System.out.println("Denkleminiz " +a+ "x2+" + b+ "x+" +c);
            System.out.println("Denklemin iki koku vardir: x1= "+x1 +" x2= "+x2);

        } else if (delta==0) {
            double x = -b/(2*a);
            System.out.println("Denkleminiz " +a+ "x2+" + b+ "x+" +c);
            System.out.println("Denklemin bir koku vardir: x= "+x);
        }else {
            System.out.println("Denkleminiz " +a+ "x2+" + b+ "x+" +c);
            System.out.println("Denklemin bir koku yoktur");
        }


    }
}
