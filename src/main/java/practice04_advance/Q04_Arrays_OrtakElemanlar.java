package practice04_advance;

import java.util.ArrayList;
import java.util.List;

public class Q04_Arrays_OrtakElemanlar {
    /*
    Iki elementte ortak bulunan elementleri yazdiriniz.
    (case sensitivity olmadan)

    input1: {John,Brand,Angel,Sofia,Emily}
    input2:{sofia,brad,grace, emily, hazel}

    Output : [brad,sofia,emily]
     */
    public static void main(String[] args) {

        String [] arr ={"John","Brad","Angel","Sofia","Emily"};
        String [] brr = {"sofia","brad","grace", "emily","hazel"};
        List <String> list = new ArrayList();

        for (String w : arr){
            for (String u :brr){
                if (w.equalsIgnoreCase(u)){
                    list.add(w);
                }
            }
        }System.out.print("Ortak elementler: " + list);


    }
}
