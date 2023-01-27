package practice05_advance;

public class Q03_MethodOverloading {

    //Kup, kare prizma ve dikdortgen prizmanin hacmini hesaplayan bir method olusturunuz.(method overloading kullaniniz)
    public static void main(String[] args) {

        Hacim hacim = new Hacim();

       int kup =  hacim.hacimHesapla(5);
        System.out.println("kup = " + kup);

        int karePrizma = hacim.hacimHesapla(5,6);
        System.out.println("karePrizma = " + karePrizma);

        int dikdortgenPrizma = hacim.hacimHesapla(5,6,8);
        System.out.println("dikdortgenPrizma = " + dikdortgenPrizma);

    }
}
