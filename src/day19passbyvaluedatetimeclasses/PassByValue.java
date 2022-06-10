package day19passbyvaluedatetimeclasses;



public class PassByValue{
    public static void main(String[] args) {
        /*
        1) When you use a variable inside a method, Java creates a copy
        of the variable and use the copy inside the method.
        Because Java wants to protect original value of the variable.
        This process is called "Pass By Value" in Java.
        2) Java uses "Pass by Value" everytime.
        3) The opposite of "Pass by Value" is "Pass by Reference",
        Java doesn't use "Pass by Reference".
         The programming languages use pass by reference does not protect the original value.
         */

        int shirt=100;
        int veteranShirt=veteransDiscount(shirt);
        System.out.println(veteranShirt); //80, Java does a copy from shirt value,
                                    // keeps the original value and changes just the copy
        System.out.println(shirt); //100

        int seniorsShirt=seniorsDiscount(shirt);
        System.out.println(seniorsShirt); //90


    }

    public static int veteransDiscount(int shirt){
        return shirt-20;
    }
    public static int seniorsDiscount(int shirt){
        return shirt-10;
    }
    public static int studentDiscount(int shirt){
        return shirt-5;
    }

}
