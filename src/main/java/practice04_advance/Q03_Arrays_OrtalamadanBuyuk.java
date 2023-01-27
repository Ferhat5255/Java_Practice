package practice04_advance;

public class Q03_Arrays_OrtalamadanBuyuk {
    //Elementlerin ortalamasindan buyuk elementleri yazdiran bir kod yaziniz
    public static void main(String[] args) {

        int[] arr ={5,9,15,1,0,11,3};

       int toplam = 0;

        for (int w : arr){
            toplam +=w;
        }

        double ortalama = toplam/ arr.length;
        System.out.println(ortalama);
        for(int w : arr)
        if(w>ortalama ){
            System.out.print(w+ " ");
        }











    }
}
