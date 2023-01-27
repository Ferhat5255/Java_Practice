package practice02_advance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q05_Arrays_ElementSil {
    public static void main(String[] args) {

        /*
        Elementlerini kullanicidan alarak bir Integer Array olusturunuz
        Kullanicidan bir index aliniz ve o indexteki elmenti siliniz.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Array limitini giriniz");
        int limit = input.nextInt();
        int[] arr = new int[limit];

        for (int i = 0; i < limit; i++) {
            System.out.println("Giriniz : Indeks " + i);
            arr[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Silmek istediginiz indeksi seciniz");
        int removeIndex = input.nextInt();
        int idx = 0;
        int[] brr = new int[limit - 1];

        for (int i = 0; i < arr.length; i++) {
            if (removeIndex != i) {
                brr[idx] = arr[i];
                idx++;
            }

        }
        System.out.println(Arrays.toString(brr));


        //2.yol**********************************
        List<Integer> numberList = new ArrayList<>();
        for(int w : arr){
            numberList.add(w);
        }
        System.out.println(numberList);
        System.out.println("Silmek istediginiz elementin indeksini giriniz");
        int silinecekIdx =input.nextInt();
        numberList.remove(silinecekIdx);
        System.out.println(numberList);

    }
}
