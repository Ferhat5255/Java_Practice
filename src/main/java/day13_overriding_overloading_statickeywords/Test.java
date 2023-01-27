package day13_overriding_overloading_statickeywords;

import java.util.Scanner;

public class Test {
    //Kullanici A Ayse ; kullanici B Burak ismini data olarak girerse cikti ne olur.

    String stdentName;
    String year = "2020";
    String studentId;
    static int counter = 1000;

    public Test() {
        Scanner input = new Scanner(System.in);
        System.out.println("Isminizi giriniz");
        stdentName = input.next();
        settudentId();
    }

    private void settudentId() {
        counter++;
        this.studentId = year + "" + counter;
    }


    public static void main(String[] args) {

        Test student1 = new Test();
        System.out.println(student1.stdentName + student1.studentId);  //A
        Test student2 = new Test();
        System.out.println(student2.stdentName + student2.studentId); //B


    }
}
