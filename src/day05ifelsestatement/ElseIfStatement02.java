package day05ifelsestatement;

import java.util.Scanner;

public class ElseIfStatement02 {

    /*
    December, January, february => winter /first condition
    March, April, May => Spring /second condition
    June, July, August => / third condition
    September, October, November =>fall / forth condition
    else  / final condition
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println(" Please type a month name");
        String month=scan.next();

        if (month.equalsIgnoreCase("December")||
                month.equalsIgnoreCase("January")||
                month.equalsIgnoreCase("February")
        ){
            System.out.println( "The season is winter");
        } else if (month.equalsIgnoreCase("March")||
                month.equalsIgnoreCase("April")||
                month.equalsIgnoreCase("May")){
            System.out.println("The season is spring");
        }else if (month.equalsIgnoreCase("June")||
                month.equalsIgnoreCase("July")||
                month.equalsIgnoreCase("August")){
            System.out.println("The season is summer");
        }else if(month.equalsIgnoreCase("September")||
                month.equalsIgnoreCase("November")||
                month.equalsIgnoreCase("October")){
            System.out.println("The season is fall");
        }else{
            System.out.println(month+ " is not entered properly");
        }


    }

}
