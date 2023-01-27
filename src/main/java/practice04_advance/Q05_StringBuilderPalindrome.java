package practice04_advance;

public class Q05_StringBuilderPalindrome {
    //Bir String degerin Polindrome olup olmadigini kontrol eden bir kod yaziniz.
    public static void main(String[] args) {


        /*String str = "nazan";

        String strReverse ="";

        for (int i = str.length()-1; i >=0; i--) {
            strReverse +=str.charAt(i);
        }
        System.out.println(strReverse);

        if (str.equalsIgnoreCase(strReverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Palindrome degil");
        }

         */

        String str = "nazan1";
        StringBuilder stb = new StringBuilder(str);

        String stbReverse = stb.reverse().toString();

        if (str.equalsIgnoreCase(stbReverse)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Palindrome degil");
        }


    }
}
