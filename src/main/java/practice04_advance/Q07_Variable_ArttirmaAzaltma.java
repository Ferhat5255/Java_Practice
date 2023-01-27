package practice04_advance;

public class Q07_Variable_ArttirmaAzaltma {
    public static void main(String[] args) {

       int x = 20;
       int y = 15;

        System.out.println(x++ + ++y);//36
        System.out.println(x);//21

        int z = 5;

        int sonuc = ++z + z++ + z++ + --z  +z-- + z;
        System.out.println(sonuc);




    }
}
