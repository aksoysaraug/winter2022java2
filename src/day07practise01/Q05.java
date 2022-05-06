package day07practise01;

import java.util.Scanner;

public class Q05 {

    /*
    Write a code using ternary:
      Create int variable : price
      Create string variable : decision
      If the price equal or less than $10 Print "it's cheap"
      If price is 10-$20 print "it's ok"
      Otherwise "it's expensive".
      EXAMPLE:
      INPUT      : price= 12
      OUTPUT  : it's ok
      INPUT      : price= 10
      OUTPUT  : it's cheap
      INPUT      : price= 23
      OUTPUT  : it's expensive

     */
    public static void main(String[] args) {
    Scanner scan=new Scanner (System.in);
        System.out.println("Enter the price");
        double price=scan.nextDouble();

        String result= price<=0 ? "Invalid price" : (price<=10 ? "It's cheap": (price<=20? "It's ok" : "It's expensive"));
        System.out.println(result);




    }
}
