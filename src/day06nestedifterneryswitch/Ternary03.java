package day06nestedifterneryswitch;

import java.util.Scanner;

public class Ternary03 {

    /*
    You have 2 integers;
    If both of the integers are positive do multiplication
    If one is negative the other one is positive return "I do not how to multiply"
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first integer");
        int i1= scan.nextInt();
        System.out.println("Enter second integer");
        int i2= scan.nextInt();
        System.out.println( i1>0 && i2>0 ? i1*i2 : "I do not how to multiply");


    }

}
