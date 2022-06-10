package day16arraystugba;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays07 {
    public static void main(String[] args) {

        // Find the longest word in a String

        String s = "Ali Can went to school to learn";

        String arr[]=s.split(" ");
        Arrays.sort(arr,Comparator.comparingInt(String::length).reversed());
        System.out.println(arr[0]);
    }
}
