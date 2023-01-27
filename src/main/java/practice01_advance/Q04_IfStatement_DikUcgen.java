package practice01_advance;

import java.util.Scanner;

public class Q04_IfStatement_DikUcgen {
    public static void main(String[] args) {
        /*
        Kullanicidan uc adet sayi alarak bu sayilarin
        bir dik ucgenin kenar uzunluklari olup olmadigini hesaplayan bir kod yaziniz.
        (Yardim: Bir ucgenin dik oldugunu anlamak
        icin a2+b2=c2 pisagor baglantisindan yararlanabilirsiniz)

        Ornek ekran ciktisi:

        birinci kenar giriniz: 3
        ikinci kenar giriniz: 4
        ucuncu kenar giriniz: 5
        Bu bir dik ucgendir.

        birinci kenar giriniz: 2
        ikinci kenar giriniz: 15
        ucuncu kenar giriniz: 7
        Bu bir dik ucgen degildir

         */
        
        Scanner input = new Scanner(System.in);
        System.out.println("Birinci kenari giriniz: ");
        int birinciKenar = input.nextInt();
        System.out.println("Ikinci kenari giriniz: ");
        int ikinciKenar = input.nextInt();
        System.out.println("ucuncu kenari giriniz: ");
        int ucuncuKenar = input.nextInt();
        
        if (birinciKenar*birinciKenar + ikinciKenar*ikinciKenar ==ucuncuKenar*ucuncuKenar) {
            System.out.println("Bu bir dik ucgendir");
        } else if (birinciKenar*birinciKenar + ucuncuKenar*ucuncuKenar ==ikinciKenar*ikinciKenar ) {
            System.out.println("Bu bir dik ucgendir");
        } else if (ikinciKenar*ikinciKenar + ucuncuKenar*ucuncuKenar == birinciKenar*birinciKenar) {
            System.out.println("Bu bir dik ucgendir");
        }else {
            System.out.println("Bu bir dik ucgen degildir");
        }


    }
}
