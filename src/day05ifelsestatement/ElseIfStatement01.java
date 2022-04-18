package day05ifelsestatement;

import java.util.Scanner;

public class ElseIfStatement01 {


    public static void main(String[] args) {

        //Week days: Monday, Tuesday, Wednesday, Thursday, Friday
        //Week days: Saturday and Sunday
        // All others are not days
        // Ask the users to give a day

        //if
        //else if
        //else

        Scanner scan=new Scanner(System.in);
        System.out.println("Please tell us a day");

        String day=scan.next();

        if (day.equalsIgnoreCase("Monday")||
                day.equalsIgnoreCase("Tuesday")||
                day.equalsIgnoreCase("Wednesday")||
                day.equalsIgnoreCase("Thursday")||
                day.equalsIgnoreCase("Friday")){
            System.out.println( day+" is a week day");
        } else if(day.equalsIgnoreCase("SAturday")||
                  day.equalsIgnoreCase("Sunday")){
            System.out.println(day+" is a weekend day");
        } else {
            System.out.println(day+ " is not a day");
        }



    }
}
