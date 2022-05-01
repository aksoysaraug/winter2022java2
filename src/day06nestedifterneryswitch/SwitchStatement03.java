package day06nestedifterneryswitch;

import java.util.Scanner;

public class SwitchStatement03 {

    /*
    Create a simple calculator which does addition, subtraction, multiplication, division, percentage calculation
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number");
        double num1= scan.nextDouble();

        System.out.println("Select operation +,-,*,/,%");
        char operation=scan.next().charAt(0);
        // To get a single character from user we type scan.next().charAt(0);


        System.out.println("Enter second number");
        double num2= scan.nextDouble();


        switch (operation) {

            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
            case '%':
                System.out.println(num1*num2/100);
                break;
            default:
                System.out.println("Invalid operation for that calculator");


        }




    }


}
