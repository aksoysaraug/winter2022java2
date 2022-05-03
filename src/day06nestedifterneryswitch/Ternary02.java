package day06nestedifterneryswitch;

import java.util.Scanner;

public class Ternary02 {

    /*
    //Type code to calculate the absolute value of a number
//For positive numbers and zero absolute value is the same with the number
//For negative numbers to find absolute value multiply the number by -1
     */
    public static void main(String[] args) {

        double a= -1.5;
        double absoluteValue= a>=0 ? a : -1*a;
        System.out.println(absoluteValue);

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        double num= scan.nextDouble();

         double absVal= num>=0 ? num : -1*num;
        System.out.println(absVal);




    }


}