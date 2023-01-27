package practice01_advance;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Q01_Variable_FahrenheitToCelsius {
    public static void main(String[] args) {


        //Fahrenheit gegeri, Celcius degere ceviren kod yaziniz.
        //formul: c= (f-32)*5/9
        
        Scanner input = new Scanner(System.in);
        System.out.println("Fahretheit degeri giriniz.");

        double f = input.nextDouble();
        double c= (f-32)*5/9;
        System.out.println(c);

        NumberFormat numberFormat = new DecimalFormat(".00");
        String formattedC = numberFormat.format(c);
        System.out.println("formattedC = " + formattedC+1);  //concatenation

      double doubleC = Double.valueOf(formattedC);
        System.out.println("doubleC = " + (doubleC+1));    // Matematiksel islemi(+)






    }
}
