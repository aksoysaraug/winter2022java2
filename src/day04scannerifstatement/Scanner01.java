package day04scannerifstatement;

import java.util.Scanner;

public class Scanner01 {

    public static void main(String[] args) {

        /*
            Type a program which calculates the volume of a rectangular prism whose length, width, and height are entered by user.
            Hint: Volume of a rectangular prism is width x length x height
        */

    Scanner scan=new Scanner(System.in);

        System.out.println("Enter the width of the ractangular prism" );//2.5
        double width = scan.nextDouble();

        System.out.println("Enter the lenght of the ractangular prism");//1.2
        double lenght = scan.nextDouble();

        System.out.println("Enter the height of the ractangular prism");//10-- this is an integer, so Java do Auto Widening by itself, because it is easy
        double height = scan.nextDouble();

        System.out.println("The volume of the rectangular prism is "+ width*lenght*height);//30





    }


}
