package day04scannerifstatement;

import java.util.Scanner;

public class IfStatement02 {

    public static void main(String[] args) {

        //Ask user to enter an integer then
//print "Even" if the integer is even
//print "Odd" if the integer is odd

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an integer to check it is even or odd");
        int num=scan.nextInt();

        if (num%2==0){
            System.out.println("Even");
        }

        if(num%2==1){
            System.out.println("Odd");
        }







    }

}
