package day03_ifstatement;

public class C04_MantikOperatorleri {
    public static void main(String[] args) {

        // && ile & arasindaki fark
        // && ile & arasindaki fark  Mukemmelleyitcidir Her sartta true
        // && de boolean sonuc 3 te bir tane false bulunca durur tum satırı kontrol etmeye calismaz
        // Ancak & tum satırı kontrol eder ondan sonra durur.
        // sonucta fark yok sadece biri ilk hatayı buldugunda durur digeri sonuna kadar gider. && tekliye göre daha hızlı calısır.

        System.out.println(5+2==8); //false

        boolean sonuc1 = 5>4 && 7<9 && 6+3 ==9 && 5+2!=8;
        System.out.println("sonuc1 ==> "+sonuc1);   //true

        boolean sonuc2 = 5>4 && 7>9 && 6+3==9 &&  5+2 !=8;
        System.out.println("sonuc2 ==> " + sonuc2);     //false

        boolean sonuc22 = 5>4 & 7>9 & 6+3==9 &  5+2 !=8;
        System.out.println("sonuc2 ==> " + sonuc22);    //false



        int sayi1 =15;
        // sayi1'in 10 ila 20 araliginda oldugunu true diyerek dondurelim
        // 10<sayi1<20  Java uclu karsilastirma yapmaz
        // ikili karsilastirmalar yapip mantiksal operatorler ile birlestirmeliyiz

        System.out.println(10<sayi1 && sayi1<20);



        int sayi2 = 5;
        // sayi2 'nin 10 ila 20 arasinda olmadigini true diyerek bir kod yazalim

        System.out.println("sayi2 10 ila 20 arasinda degildir:" + (sayi2<10 || sayi2<20));  //true
        System.out.println(sayi2<10 || sayi2>20);

        // &&==ve    ||= veya







    }
}
