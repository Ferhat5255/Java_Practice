package practice01_advance;

public class Q03_RegexQuantifiers {
    public static void main(String[] args) {

        //  Bir String degerin belirli sayida karakter icerip belirli bir karakter ile bitip bitmedigini kontrol eden bir kod yaziniz

        String str = "as";
        System.out.println(str.matches(".s"));   // true ==>herhangi bir karakter ile baslayip 's' harfi ile bitiyor.
        //matches() methodu regex ile calisip String degerin regex ile karsilastirmasini yapar.
        System.out.println(str.matches("..s")); //false ==> 3 karakterli olmadigi icin

        //  Bir String degerin 'ikinci' karakterinin "belirli" bir karakter olup olmadigini kontrol eden bir kod yaziniz
        System.out.println("qsfygihoj".matches(".s.*"));  //true    ==> ilk karakter herhangi biri, ikinci karakter 's'
        //.* ==> esnek sayida karakter (0 ya da daha fazla)
        System.out.println("qsfygihoj".matches(".r.*"));  // false  ==>  ikinci karakter uyusmuyor

        //  Bir String degerin sadece harf icerip icermedigini kontrol eden bir kod yaziniz
        System.out.println("abc".matches("[a-zA-Z]*"));

        //Bir String degerin belirli bi sayida belirli karakterleri icerdigini kontrol eden bir kod yaziniz
        System.out.println("abcdh".matches("[a-zA-Z]{5}"));  //true    ==> 5 karakterli ve hepsi de harf
        System.out.println("abcdfdgSdh".matches("[a-zA-Z]{5}"));  //false ==> 5'ten fazla karakter iceriyor
        System.out.println("1fSdh".matches("[a-zA-Z]{5}"));    //false ==> harf disinda karakter iceriyor

        //Bir String degerin belirli karakterleri en az belirli sayida icerip icermedigini kontrol eden bir kod yaziniz
        System.out.println("1234567".matches("[0-9]{6,}"));  //true    ==> en az 6 rakam iceriyor
        System.out.println("12345".matches("[0-9]{6,}"));  // false ==> 6'dan az karakter iceriyor
        System.out.println("12345x".matches("[0-9]{6,}"));  // false ==> rakam disi karakter iceriyor

        //Bir String degerin belirli karakterleri en az ve en cok belirli sayida icerip icermedigini kontrol eden bir kod yaziniz
        System.out.println("abcd123".matches("\\w{7,10}"));  //true    ==> en az 7 karakter (\\w) iceriyor
        //  \\w = [a-zA-Z0-9_]
        System.out.println("abcd123xAc".matches("\\w{7,10}"));  //true    ==> en fazla 10 karakter (\\w) iceriyor

        //ilk karakter 1, ikinci karakter noktalama isareti ve kalan 8 karakter rakam toplam 10 karakter olmali
        System.out.println("1?12345678".matches("[1][\\p{Punct}][0-9]{8}"));  //true    ==> tum kosullari sagliyor
















    }
}
