package day20practiseinterview;

import java.util.Arrays;
import java.util.Scanner;

public class Interview05 {
    public static void main(String[] args) {

        /*	  Ask user to enter 2 Strings.
        If the characters and the numbers of characters of the
        Strings are same then print "Anagram" on the console.
        Otherwise, print "Not Anagram" on the console.
        Ignore cases.
        For example; "Mary" and "army" and "RAMY" are Anagrams.	*
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first String");
        String s1= scan.next().toLowerCase();
        System.out.println("Enter second String");
        String s2=scan.next().toLowerCase();

        String arr1[]=s1.split("");
        String arr2[]=s2.split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

    }
}
