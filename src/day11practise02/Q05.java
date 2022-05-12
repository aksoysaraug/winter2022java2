package day11practise02;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {



    /*
    Type a program to check if a positive number is perfect or not
    For example if the number is 6, we should see
    Perfect Number
    on the console.
    (The factors of 6 are : 1,2,3,6
    1+2+3=6  ==> it is perfect number (you will only count the factors except itself))
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();
        int sum=0;

        for (int i=1; i<num; i++){

            if(num%i==0){
                sum=sum+i;
            }

        }
        if(sum==num){
            System.out.println("Perfect number");
        } else {
            System.out.println("Not perfect number");
        }

    }
}
