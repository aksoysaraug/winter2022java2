package day05ifelsestatement;

import java.util.Scanner;

public class AndOperator {
    public static void main(String[] args) {


        // && operator
    /*
    Ihave zoom, I can watch the instructor
    I have PC, i can write my codes
     */

    /*
    age 0-5 baby
     */
Scanner scan=new Scanner(System.in);
        System.out.println("Enter the age");
        int babyAge=scan.nextInt();

        if(0<babyAge && babyAge<5){
            System.out.println("It is a baby");
        }

    /*
    If I have money, I can buy something
    If I have car, I can go shopping
     */
    boolean money= true;
    boolean car=true;

    if (money && car){
        System.out.println("I can go shopping and buy something");
    } else{
        System.out.println("I cannot buy anything");
    }

    }
}
