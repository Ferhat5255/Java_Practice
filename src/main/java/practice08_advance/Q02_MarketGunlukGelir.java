package practice08_advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02_MarketGunlukGelir {
    /*
    Gunluk gelir market programi yaziniz
        -Tum gunlerin gelirlerini gosteren bir method,
        -Haftalik gelir ortalamasini gosteren bir method,
        -Hangi gunlerin ortalama gelirden fazla geliri oldugunu gosteren bir method,
        -Hangi gunlerin ortala gelirden az geliri oldugunu  gosteren bir method,
     */

   static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"));
    static List<Double> gunlukGelirler = new ArrayList<>();
    static double toplamGelir= 0;


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int gun = 0;
        while (gun<7){
            System.out.println(gunler.get(gun) + " gelirini giriniz");
            double gununGeliri = input.nextDouble();
            gunlukGelirler.add(gununGeliri);
            toplamGelir +=gununGeliri;
            gun++;
                    }
        System.out.println("Gunluk Gelirler "+gunlukGelirler);
        System.out.println("Toplam Gelir = "+ toplamGelir);
        System.out.println("Gelir Ortalamasi: "+gelirOrtalamasi());
        System.out.println("Ortalama Ustu Gunler : "+ortalamaUstuGunler());
        System.out.println("Ortalama Alti Gunler : "+ortalamaAltiGunler());
    }

    static  double gelirOrtalamasi(){
        return  toplamGelir/7;
    }

    static  String ortalamaUstuGunler (){
        String str= "";

        for(int i=0;i<gunlukGelirler.size();i++){
            if(gunlukGelirler.get(i)> gelirOrtalamasi()){
                str+= gunler.get(i)+ "";
            }
        }
        return str;
    }

    static  String ortalamaAltiGunler (){
        String str= "";

        for(int i=0;i<gunlukGelirler.size();i++){
            if(gunlukGelirler.get(i)< gelirOrtalamasi()){
                str+= gunler.get(i)+ "  ";
            }
        }
        return str;
    }
}
