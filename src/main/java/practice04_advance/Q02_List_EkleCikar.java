package practice04_advance;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q02_List_EkleCikar {
    /*
    Kullanicidan aldiginiz bir sayiyi bir list'e ekleyen,
    List'ten cikaran ya da mevcut bir elementi o sayi ile guncelleyen bir kod yaziniz
        */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        while (true) {

            System.out.println("Ekleme yapmak icin 'add'|n" +
                    "Guncelleme yapmak icin 'update'\n+" +
                    "Silmek icin 'delete'\n"+
                    "Cikmak icin 'quit' komutunu giriniz.");

            String option = input.next();

            if (option.equalsIgnoreCase("add")){
                System.out.println("Eklemek istediginiz sayiyi giriniz");
                int eklenecekSayi = input.nextInt();
                list.add(eklenecekSayi);
           }else if (option.equalsIgnoreCase("update")){
                System.out.println("Guncellemek istediginiz sayiyi giriniz");
                int guncelllenekSayi = input.nextInt();
                System.out.println("Girmek istediginiz yeni sayiyi giriniz.");
                int yeniSayi = input.nextInt();
                list.set(list.indexOf(guncelllenekSayi),yeniSayi);
            }else if (option.equalsIgnoreCase("delete")){
                System.out.println("silmek istediginiz sazyiyi giriniz");
                int silinecekSayi = input.nextInt();
                list.remove((Integer)silinecekSayi);
            }else if (option.equalsIgnoreCase("quit")){
                break;

            }else {
                System.out.println("Gecerli bir komut giriniz");
            }
        }

        System.out.println("Gule gule!!! ");




    }
}
