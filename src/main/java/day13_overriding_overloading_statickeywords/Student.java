package day13_overriding_overloading_statickeywords;

import javax.sound.midi.Soundbank;

public class Student {

    String name;
    static  String collage = "UNF";

    Student(String n, String college) {
        this.name=n;
        this.collage=college;
    }

    public static void main(String[] args) {

        Student s1 = new Student("Mark", "UCF");
        Student s2 = new Student("Fahri", "FIU");

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s1.collage);
        System.out.println(s2.collage);
    }
}
