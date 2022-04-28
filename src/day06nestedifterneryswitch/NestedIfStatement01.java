package day06nestedifterneryswitch;

import java.util.Scanner;

public class NestedIfStatement01 {
    /*
    Ask user to enter a password (It will be Ali22!)

		If the initial of the password is uppercase then check if it is ‘A’ or not.
		If it is ‘A’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; Ali ==> Valid password    -     ali ==> Invalid    -    Mark ==> Invalid

		If the initial of the password is lowercase then check if it is ‘z’ or not.
		If it is ‘z’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; zoe ==> Valid password    -     Zoe ==> Invalid    -    john ==> Invalid
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a password");
        String pwd=scan.nextLine();

        //How to get first character from a String
        System.out.println(pwd.charAt(0)); //Java go the pwd String look at the character at index 0 //A

        if (pwd.charAt(0)>='A' && pwd.charAt(0)<='Z') {

            if (pwd.charAt(0) == 'A') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Involid Password");
            }
        }

        if(pwd.charAt(0)>='a' && pwd.charAt(0)<='z'){
            if(pwd.charAt(0)=='z'){
                System.out.println("Valid Password");
            } else {
                System.out.println("Involid Password");
            }
        }

    }


}
