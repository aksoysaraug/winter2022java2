package day13statickeywordvariabletypes;

public class Static01 {

    public static int sCounter=0; // static variable (class variable)
    public int iCounter=   0; // instance variable (object variable)

    public Static01(){  //constructor
        sCounter++;
        iCounter++;
    }


    public static void main(String[] args) {

        Static01 obj1=new Static01();
        Static01 obj2=new Static01();
        Static01 obj3=new Static01();

        System.out.println("Value of sCounter: "+ obj3.sCounter); //3
        System.out.println("Value of sCounter: "+obj3.iCounter); //1

        System.out.println("Value of sCounter: "+ obj2.sCounter); //3
        System.out.println("Value of sCounter: "+obj2.iCounter); //1

        int age=13; // local variable, you can create it only in a method
        System.out.println(age);








    }
}
