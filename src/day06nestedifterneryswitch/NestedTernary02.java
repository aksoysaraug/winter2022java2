package day06nestedifterneryswitch;

import java.util.Scanner;

public class NestedTernary02 {

    /*
        Type code to check the password
        If it has more than 8 characters, initial should be 'i"
        If it has no more than 8 characters initial should be 'K'

        Solve the task by using nested-ternary
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
         System.out.println("Enter a password");

        String psw= scan.next();

        String result= psw.length()>8 ? (psw.charAt(0)=='i'? "valid password": "not valid password") :
                (psw.charAt(0)=='K' ? "valid password" : "not valid password");

        System.out.println(result);




    }

}
