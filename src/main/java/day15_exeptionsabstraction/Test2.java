package day15_exeptionsabstraction;

public class Test2 {

    String str = "a";
    void A() {                 //==>4
        try {
            str = str + "b";  //==>5   ab
            B();              //==>6
        } catch (Exception e) {
            str = str + "c";
        }
    }
    void B() throws Exception {  //==>7
        try {
            str = str + "d";     //==>8   abd
            C();                //==>9
        } catch (Exception e) {  //==>12
            str = str + "e";     //==>13  abde
        } finally {              //==>14
            str = str + "f";     //==>15  abdef
        }
        str = str + "g";         //==>16  abcdefg
    }
    void C() throws Exception {   //==>10
        System.out.println(12/0); //==>11
    }
    void display() {               //==>18
        System.out.println(str);   //==>19  abdefg
    }
    public static void main(String[] args) {  //==> 1
        Test2 object = new Test2();           //==>2
        object.A();                           //==>3
        object.display();                     //==>17
    }
}