package day06nestedifterneryswitch;

import java.util.Scanner;

public class Ternary01 {
    /*
     if an integer is positive print "The integer is positive"
     otherwise print "The integer is not positive"
     */

    public static void main(String[] args) {

    //1. Way: Solve by using if-else statement
    int num=10;
    if (num>0){
        System.out.println("The integer is positive");
    } else {
        System.out.println("The integer is not positive");
    }

    //2. Way: Ternary
    String result=num>0 ? "The integer is positive" : "The integer is not positive";
        System.out.println(result);

    // Write a program to print the minimum of 2 integers on the console.
    // Use ternary...

        int i1=10;
        int i2= 15;
        String res= i1>i2 ? i2+" is minimum number" : i1 + " is minimum number";
        System.out.println(res);


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your first integer");
        int int1=scan.nextInt();
        System.out.println("Enter your second integer");
        int int2=scan.nextInt();

        String r= int1<int2 ? int1 + " is minimum number" : int2 + " is minimum number";
        System.out.println(r);

        int a = 100;
        int b = 100;
        int min = a<b ? a : b;
        System.out.println(min); //100



    }
}
