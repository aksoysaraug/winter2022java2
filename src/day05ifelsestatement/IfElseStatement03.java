package day05ifelsestatement;

import java.util.Scanner;

public class IfElseStatement03 {

    public static void main(String[] args) {

        //ask user to type the weather sunny/rainy

        Scanner scan=new Scanner(System.in);
        System.out.println("Please tell us the weather if it is 'sunny' or 'rainy' ");
        String weather= scan.next();


        if ( weather.equalsIgnoreCase("sunny")){
            System.out.println("The weather is nice today! Can go shopping.");
        } else {
            System.out.println("We cannot go out today");
        }

        //If I have more than $100, then I can buy a headphone

        int amount=110;

        if(amount>100){
            System.out.println("I can buy a headphone");
        } else {
            System.out.println("I can not buy a headphone");
        }




    }

}
