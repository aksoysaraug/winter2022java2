package day07practise01;

import java.util.Scanner;

public class Q07 {

    /*

Type a program that ask user their age and gender.
If age is greater or equal than 18 and if gender is male, then print man ,
If age is greater or equal than 18 and if gender is female then print woman
If age is less than 18 and if gender is male then print boy ,
If age is less than 18 and if gender is female then print girl on the console.

     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= scan.nextInt();
        System.out.println("Enter your gender (f/m)");
        char gender= scan.next().toLowerCase().charAt(0);

        if (age>= 18 && gender=='m'){
            System.out.println("man");
        } else if (age>18 && gender=='f'){
            System.out.println("woman");
        } else if (age<18 && gender=='m' && age>0){
            System.out.println("boy");
        }else if (age<18 && gender=='f'&& age>0){
            System.out.println("girl");
        } else {
            System.out.println("Invalid entrance");
        }


        if (age>=18){
            if (gender == 'f') {
                System.out.println("woman");
            } else if ( gender=='m') {
                System.out.println("man");}
        } else if (age>0 && gender== 'f'){
            System.out.println("girl");
        } else if(age>0 && gender== 'm') {
            System.out.println("boy");
        } else {
            System.out.println("Invalid entrance");
        }


    }
}
