package day24objectmanipulations;

import java.util.Scanner;

public class MainRunner {

    public static void main(String[] args) {
        /*
        Type a program that asks user their name and last name.
        Then create an email for the user.
        Concatenate the name and lastname then add @gmail.com
   */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please type your name");
        String name =scan.nextLine().replaceAll("\\s","").toLowerCase();;

        System.out.println("Please type your lastname");
        String lastname=scan.nextLine().replaceAll("\\s","").toLowerCase();;


        System.out.println(getEmail(name, lastname));

    }

    public static String getEmail(String a, String b){
        return (a+b+"@gmail.com").toLowerCase();
    }


}
