package day06nestedifterneryswitch;

import java.util.Scanner;

public class SwitchStatement01 {

    /*
      Get the number of days from user and print the name of the day
      For example; 1 ==> Sunday, 2 ==> Monday, etc.
     */

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter day number");
        int num= scan.nextInt();

    //1. Way: if-else-if statement

        if (num==1){
            System.out.println("Sunday");
        } else if (num==2){
            System.out.println("Monday");
        }else if (num==3){
            System.out.println("Tuesday");
        } else if (num==4){
            System.out.println("Wednesday");
        }else if (num==5){
            System.out.println("Thursday");
        }else if (num==6){
            System.out.println("Friday");
        }else if (num==7){
            System.out.println("Saturday");
        }else {
            System.out.println("What kind of user are you? Don't you know day numbers are from 1 to 7?");
        }

    //2. Way: Switch statement

        switch (num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day number");
                break; // it is optional
        }




    }


}
