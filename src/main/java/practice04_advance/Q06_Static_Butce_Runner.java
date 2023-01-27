package practice04_advance;

public class Q06_Static_Butce_Runner {
    //Basit bir ev butcesi kodu yaziniz
    public static void main(String[] args) {

         Butce baba = new Butce();
        System.out.println("maas oncesi butce: " + Butce.butce);//0
        baba.maasAl(5000);
        System.out.println("maas sonrasi butce:  " + Butce.butce);//5000

        System.out.println(baba.harclik);//0
        baba.harclikAl(500);
        System.out.println( "Butce: " +  Butce.butce);//4500
        System.out.println("Harclik: " + baba.harclik);//500

        baba.harclikHarca(266);
        System.out.println( "Butce: " +  Butce.butce);//4500
        System.out.println("Baba Harclik: " + baba.harclik);//234

        baba.butcedenHarca(1000);
        System.out.println( "Butce: " +  Butce.butce);//3500

        Butce anne = new Butce();
        anne.maasAl(2000);
        anne.maasAl(3000);
        anne.harclikAl(2000);
        anne.butcedenHarca(300);

        System.out.println( "Butce: " +  Butce.butce);//
        System.out.println("Anne Harclik: " + anne.harclik);//

        Butce kiz = new Butce();
        kiz.harclikAl(500);
        kiz.harclikHarca(400);

        System.out.println( "Butce: " +  Butce.butce);//
        System.out.println("Harclik: " + kiz.harclik);//

    }
}
