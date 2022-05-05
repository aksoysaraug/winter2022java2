package day07practise01;

import java.util.Scanner;

public class Q03 {

     /*
 Type java code by using ternary and if-else. Ask user to enter two integers
 Write a program to print the maximum  one on the console.(Do not forget they may be equal)
*/
     public static void main(String[] args) {

         Scanner scan=new Scanner(System.in);
         System.out.println("Enter first integer");
         int num1=scan.nextInt();
         System.out.println("Enter second integer");
         int num2=scan.nextInt();


         System.out.println (num1==num2 ? "They are equal" : (num1>num2 ? num1 :num2));

     }

}
