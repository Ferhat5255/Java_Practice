package practice02_advance;
/*
2 boyutlu bir tablo olarak, ekrana carpim tablosunu hesaplayip yazan kodu yaziniz.

Ornek Ekran ciktisi
1  2  3  4   5
2  4  6  8   10
3  6  9  12  15
4  8  12 16 20
5 10  15 20 25

Ekran ciktisi 5 * 5 boutlari icin ornek olarak verilmistir,
isterseniz boyutlari klavyeden okuyup istenen boyutlara gore
ekrana basan bir kod yazabilirsiniz
 */

import java.util.Scanner;

public class Q04_NestedFor_Matrix {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir integer giriniz");
        int sayi = input.nextInt();

        for (int i = 1; i <=sayi; i++) {
             for (int j = 1; j <=sayi; j++){

                 System.out.print(i*j+ " ");
             }
            System.out.println();
        }



    }
}
