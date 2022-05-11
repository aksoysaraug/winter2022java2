package day11dowhileconstructors;

import java.util.Scanner;

public class DoWhile02 {
    public static void main(String[] args) {

        /*
	 	  Ask user to enter an integer.
		  If the integer is less than 100, tell user “Won!”
		  Otherwise tell user “Lost!”
	 */

        Scanner scan=new Scanner(System.in);

        int n=0;// Here you can put every value you want, it is not important,
                // because user will change the value. But Java uses zero as default' therefor I put zero.
                // This is the starting value.

        do{
            System.out.println("Enter an integer");
            n=scan.nextInt();
            if (n<100){
                System.out.println("Won!");
            }

        } while(n<100);

//        In this task user changes the value, user do increment or decrement,because of that
//        no need to type increment or decrement code.

        System.out.println("Lost!");




    }
}
