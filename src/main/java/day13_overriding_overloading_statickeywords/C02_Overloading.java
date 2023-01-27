package day13_overriding_overloading_statickeywords;

public class C02_Overloading {
    public static void main(String[] args) {


        //Ayni classda ayni isimde method olusturmak icin method signature degistirilir

        cikarma(98, (float) 52.666);

        cikarma(14.5, 3);

        toplama(55, 66);

        toplama(2.3, 4.5);

        carpma(2, 3);
        carpma(8.9, 32);

    } //main

    //data type'leri degistirilerek .

    private static void carpma(double v, int i) {
        System.out.println("double ile int carpma yapildi " + (v * i));
    }

    private static void carpma(int i, int i1) {
        System.out.println("iki int deger carpma yapildi " + (i * i1));
    }

    private static void toplama(double v, double v1) {
        System.out.println("iki double deger toplandi " + (v + v1));
    }

    private static void toplama(int i, int i1) {
        System.out.println("iki int deger toplandi " + (i + i1));
    }

    private static void cikarma(double v, int i) {
        System.out.println("double ile int cikarma yontemi " + (i - v));
    }

    private static void cikarma(int i, float v) {

        System.out.println("int bir deger ile float cikarma yontemi " + (i - v));
    }

    //parametrelerin sayilari artttirilarak
    private static void toplama(double v, double v1,double v2) {
        System.out.println("uc double deger toplandi " + (v + v1 + v2));
    }
    private static void toplama(double v, double v1,double v2,double v3) {
        System.out.println("dort double deger toplandi " + (v + v1 + v2+v3));
    }

    //data turleri farkli oldugunda parametrelerinin yerlerini degistirerek
    public static void carpma(float a, double b) {
        System.out.println("ilki float ikincisi double ile deger carpma yapildi " + (a * b));
    }
    public static void carpma(double b, float a ) {
        System.out.println("ilki double ikincisi int ile deger carpma yapildi " + (a * b));
    }




}
