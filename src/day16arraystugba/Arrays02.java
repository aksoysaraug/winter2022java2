package day16arraystugba;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

//        Please split this into letters

         String name= "FatmaSeher";
         String arr[]=name.split("");
        System.out.println(Arrays.toString(arr));// Data types of the elements are String


//      Please split this name into char array
        char crr[]=name.toCharArray();
        System.out.println(Arrays.toString(crr));// Data types of the elements are char
    }
}
