package day07practise01;

import java.util.Scanner;

public class Q04 {
    /*
Ask user to enter a number. If the number is less than 10 and greater
than or equal to 0, calculate its cube. Otherwise, calculate its square.
Cube of a = a*a*a Square of a = a*a
*/
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();

        int result= num>=0 && num<10 ? num*num*num : num*num;
        System.out.println(result);



        if (num>=0 && num<10){
            System.out.println(num*num*num);
        }else {
            System.out.println(num*num);
        }

    }


}
