package day11dowhileconstructors;

import java.util.Scanner;

public class DoWhile03 {

    public static void main(String[] args) {

        /*
	 	Username ise “admin”, Password is “pwd123"
	 	Ask user to enter username and password
	 	User should see “Enter your username and password” message
	 	If he enters correct credentials he should get “You are in your account!” message
	 	Otherwise, he should see “Enter your username and password” message 3 times
	 	After 3 times he should get “Your account is blocked” message
	 */

        Scanner scan=new Scanner(System.in);


        String user="";
        String pass="";
        int i=1;

        do{
            if(i==4) {
                System.out.println("Your account is blocked");
                break;
            }
            System.out.println("Enter your username");
            user=scan.next();
            System.out.println("Enter your password");
            pass=scan.next();

            if (user.equals("admin") && pass.equals("pwd123")){
                System.out.println("You are in your account!");
            break;
            }

            i++;

        }while(i<4);





    }

}
