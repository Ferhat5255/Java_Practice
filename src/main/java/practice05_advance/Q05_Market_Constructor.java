package practice05_advance;

public class Q05_Market_Constructor {
    //Urun adi,urun fiyati ve (varsa) son kullanma tarihlerini yazdiran bir market programi yaziniz

    public static void main(String[] args) {

        Market ekmekObjesi = new Market("Ekmek", 5, 1);
        System.out.println("Urun Adi : " + ekmekObjesi.urunAdi + "Urun fiyati : " + ekmekObjesi.urunFiyati + "  Son kullanma tarihi : " + ekmekObjesi.sonKullanmaTarihi);


        Market nutellaObjesi = new Market("Nutella", 45, 20);
        System.out.println("Urunun Adi : " + nutellaObjesi.urunAdi + "Urun fiyati : " + nutellaObjesi.urunFiyati + "  Son kullanma tarihi : " + nutellaObjesi.sonKullanmaTarihi);

        Market bardakObjesi = new Market("Bardak", 50);
        System.out.println("Urunun Adi : " + bardakObjesi.urunAdi + "Urun fiyati : " + bardakObjesi.urunFiyati + "  Son kullanma tarihi : " + bardakObjesi.sonKullanmaTarihi);

    }

}
