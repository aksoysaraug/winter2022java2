package day16arrays;

import java.util.Arrays;

public class SplitName {
    public static void main(String[] args) {

//        What is the second word from a given String?

         String name="Ali Can";
         String arr[]=name.split(" ");
         String secondWord=arr[1];
        System.out.println(secondWord);

//        Please split this name into a char array.
        String name2="M o h a m m a d";

//  1. Way:
        String nameWithoutSpace=name2.replaceAll(" ","");

        char arr2[]=nameWithoutSpace.toCharArray();

        System.out.println(Arrays.toString(arr2));

//        2.Way:
        String name2Char[]=name2.split(" ");
        String s="";

        for (String w: name2Char){
            s=s+w;
        }
        char crr[]=s.toCharArray();

        System.out.println(Arrays.toString(crr));

    }
}
