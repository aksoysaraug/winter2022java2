package day05ifelsestatement;

import java.util.Scanner;

public class AgesAndStages {
    public static void main(String[] args) {

    /*
    0-4 => baby
    4-12 => child
    12-20 => teenager
    20-30 => adult
    else (not expected age)
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Please type your age");
        int age= scan.nextInt();

        if(age>= 0 && age <=4){
            System.out.println("This is a baby");
        } else if (age>4 && age <= 12){
            System.out.println("This is a child");
        } else if (age>12 && age <= 20){
            System.out.println("This is a teenager");
        }else if (age>20 && age<=30){
            System.out.println("This is an adult");
        } else {
            System.out.println("unexpected age typed");
        }


    }
}
