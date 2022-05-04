package day07practise01;

import java.util.Scanner;

public class Q01 {

    /*
A company decided to give bonus of 5% to employee if his/her year of
service is 5 and more than 5 years.
Ask user for their salary and year of service and print the net bonus amount.
If employee can not get bonus, print how many more years he/she should work.

EXAMPLE:
INPUT   :   Year    => 4 year service
            Salary  => 4000

OUTPUT :  You need to work 1 year(s) to get bonus
 */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your salary");
        double salary=scan.nextDouble();

        System.out.println("Enter the year of the service?");
        double year=scan.nextDouble();

        if(year<0 || salary<0){
            System.out.println("Enter valid datas");
        }else if(year>=5){
            System.out.println("You will get "+ salary*5/100);
        }else if (year==1){
            System.out.println("You need to work 4 years to get bonus");
        }else if(year==2){
            System.out.println("You need to work 3 years to get bonus");
        } else if (year==3){
            System.out.println("You need to work 2 years to get bonus");
        } else if (year==4){
            System.out.println("You need to work 1 years to get bonus");
        }

        String result= (year>=5 && salary>0)? "You will get " + salary*5/100 :(year<0 || salary<0 ? "Enter valid datas" :
                "You need to work " + (5-year) + " year(s) to get bonus");
        System.out.println(result);



    }

}
