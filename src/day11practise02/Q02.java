package day11practise02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
          /*
Write a Java program to take the last three characters
from a given string and add these three characters
 at both the front and back of the string.
String length must be at least three and more.
INPUT      : Ankara
   OUTPUT  : araAnkaraara
 */


        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String which has at least 3 characters");
        String s= scan.nextLine().trim();

        if (s.length()>=3) {

            System.out.println(s.substring(s.length() - 3) + s + s.substring(s.length() - 3));
        } else{
            System.out.println("Invalid entrance");
        }
    }

}
