package practice02_advance;

public class Q06_Arrays_BelirliToplamiVerenIkililer {
    public static void main(String[] args) {

        /*
        Toplamlari verilen bir sayiya esit olan Array element ciflerin yazdiran bir method olusturunuz.

        {4, 6, 5, -10, 8,5,20}   ==>
        4 + 6 = 10
        5 + 5 =10
        -10 + 20 =10
         */


        int[] arr = {4, 6, 5, -10, 8,5,20};

        ikililerBul(arr,13);

    }

    public static void ikililerBul(int[] arr, int number){



        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] + arr[j] == number) {

                    System.out.println(arr[i] + " + " + arr[j] + " = "+number);
                }


            }
        }

    }
}
