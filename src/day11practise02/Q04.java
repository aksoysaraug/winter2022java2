package day11practise02;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

             /*
Ask user to enter a name and a character,
      then check how many times the character is repeated
      in the name by using for loop(make code case-sensitive)
     Example:
     INPUT      :char ch1= 'a' ;
                 String name ="John came late";
     OUTPUT :  a is repeated 2 times in this String
*/
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a name");
        String str=scan.nextLine();

        System.out.println("Enter a character");
       char c= scan.next().charAt(0);

       int counter= 0;
       for (int i=1;i< str.length(); i++){

           if (c==str.charAt(i)){
               counter=counter+1;
           }
       }
        System.out.println(c+" is repeated "+ counter + " times in this String");





    }
}
