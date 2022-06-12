package day20practiseinterview;

import java.util.Scanner;

public class Interview02 {
    public static void main(String[] args) {
        //Write a Java Program to swap two numbers

//        1. Way:
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers to swap");
        double n1=scan.nextDouble();
        double n2= scan.nextDouble();

        System.out.println("Before swapping numbers: "+n1+" "+n2);
        double temp=n1; // we will create a temporary container
        n1=n2;
        n2=temp;
        System.out.println("After swapping numbers: "+n1+" "+n2);

//        2.Way: without using temporary container

        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("After swapping numbers: "+n1+" "+n2);



    }
}
