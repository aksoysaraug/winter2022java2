package day07practise01;

import java.util.Scanner;

public class Q08 {
        /*
    Type the codes which asks the user to put the letters for the favorite football club in Turkey.
    It prints "Galatasaray" for gs,
    it prints "Trabzonspor" for ts,
    it prints "Besiktas" for bjk, and
    it prints "Fenerbahce" for fb.
    Please use switch statement in your codes.
         */

    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
        System.out.println("Enter your favourite football abbreviation");
        String a= scan.next().toLowerCase();

        switch (a) {
            case "gs" :
                System.out.println("Galatasaray");
                break;
            case "ts" :
                System.out.println("Trabzonspor");
                break;
            case "bjk":
                System.out.println("Besiktas");
                break;
            case "fb":
                System.out.println("Fenerbahce");
                break;
            default:
                System.out.println("Please enter valid letters");
        }



    }


}
