package practice07_advance;

import java.util.Arrays;

public class Q01_ArrayToStringNegative {

    /*
      Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.

      Input:
      String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};

      Output:
      String output ="JavaIsNOTDifficult";
       */
    public static void main(String[] args) {

        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        System.out.println(Arrays.toString(arr));

        String str="";
        for(String w :arr) {
            str += w;

        }
        System.out.println(str);

        String output= str.replace("Is","sNOT");
        System.out.println(output);

    }

}
