package day04scannerifstatement;

import java.util.Scanner;

public class IfStatement03Repeat {

    //Ask user to enter a day name then
    //print "Weekday" for Monday, Tuesday, Wednesday, Thursday, Friday
    //print "Weekend Day" for Saturday and Sunday

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a day name");
        String dayName=scan.next();

        if (dayName.equals("Monday")||dayName.equals("Tuesday")||dayName.equals("Wednesday")||dayName.equals("Thursday")||dayName.equals("Friday")){
            System.out.println("Weekday");
        }
        if (dayName.equals("Saturday")||dayName.equals("Sunday")){
            System.out.println("Weekend Day");
        }

             if(dayName.equalsIgnoreCase("Monday")||
                dayName.equalsIgnoreCase("Tuesday")||
                dayName.equalsIgnoreCase("Wednesday") ||
                dayName.equalsIgnoreCase("Thursday")||
                dayName.equalsIgnoreCase("Friday") ) {
            System.out.println("Weekday");
        }

        boolean isWeekday= dayName.equalsIgnoreCase("Monday")||
                           dayName.equalsIgnoreCase("Tuesday")||
                           dayName.equalsIgnoreCase("Wednesday")||
                           dayName.equalsIgnoreCase("Thursday")||
                           dayName.equalsIgnoreCase("Friday");

        if (isWeekday){
            System.out.println("Weekday");
        }


    }


}
