package practice08_advance;

public class Q04_Inheritance_Runner {

    public static void main(String[] args) {


        B obj = new B();
        obj.i = 0;
        System.out.println(obj.i);

        A objA = new A();
        objA.yazdir();

        A obj2 = new B();
        obj2.yazdir();
    }

}
