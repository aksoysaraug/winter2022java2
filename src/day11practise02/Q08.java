package day11practise02;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {

         /*
Get the number of rows from user then draw a right triangle by using asterixs
Number of rows = 4 ==>    *
                          * *
                          * * *
                          * * * *
*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of rows");
        int rows=scan.nextInt();

        for (int i=1;i<=rows; i++){

            for(int k=1; k<=i; k++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
