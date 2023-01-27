package practice02_advance;

/*
Tek bir String icerisinde verilen euro ve dolarlarin ayri ayri toplamlarin bulan bir kod yaziniz.
Ornek:
    String str = "$1 $12 E34  E56 E45 E78";
      dolarToplami: 58
      euroToplami: 168
 */

import java.util.Arrays;

public class Q03_For_EuroDolarToplamlari {
    public static void main(String[] args) {
        String str = "$1 $12 E34  E56 E45 E78";
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));

        int dolar =0;
        int euro =0;

        for (String w : arr){

            if(w.contains("$")) {
                dolar += Integer.parseInt(w.replace("$", ""));

            }else {
                euro += Integer.parseInt(w.replace("E", ""));
            }
        }
        System.out.println("dolar= "+dolar);
        System.out.println("euro= "+euro);

    }

}
