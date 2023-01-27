package day13_overriding_overloading_statickeywords;

public class C01_Varargs {
    public static void main(String[] args) {


        //Verilen sayilardan ilki haric tum sayilari toplayip ilk sayiyla carpan bir method olusturunuz

        int sayi1 = 5;
        int sayi2 = 7;
        int sayi3 = 2;
        int sayi4 = 4;
        int sayi5 = 9;


        toplam(sayi1, sayi2, sayi3, sayi4, sayi5);
    }

    private static void toplam(int sayi1, int... toplanacakSayi) {
        int toplam = 0;

        for (int w : toplanacakSayi) {          //ilki haric tutttuk
            toplam += w;

        }
        System.out.println("Toplam :" + toplam);
        System.out.println("Toplam ile Ilksayinin carpimi :" + (sayi1*toplam));


    }


}
