package day16arraystugba;

import java.util.Scanner;

public class Arrays04 {
    public static void main(String[] args) {

        //1)Get string from user and type code to find the number of words in a String.
//2)Count how many words starts with "a".(Make code case-sensitive)

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=scan.nextLine();

        String srr[]=s.split(" ");
        System.out.println("Number of words in the String is "+srr.length);

        int counter=0;
        for (String w: srr){
            if (w.startsWith("a")){
                counter++;
            }
        }
        if (counter>0){
            System.out.println(counter+ " word(s) starts with 'a'");
        } else{
            System.out.println("In the String isn't any word witch starts with 'a'");
        }



    }
}
