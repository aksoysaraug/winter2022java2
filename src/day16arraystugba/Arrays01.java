package day16arraystugba;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

//  Put each word to an array as an element

        String words= "I go to school";
        String arr[]=words.split(" ");
        System.out.println(Arrays.toString(arr));

        String name="Sevval#Mustafa#Suat#Fatmanur";
        String srr[]=name.split("#");
        System.out.println(Arrays.toString(srr));

//        Please seperate each sentence from "and", put them in an array.
        String sentence= "I go to school and i talk to friends and i talk to teachers";
        String arrSen[]=sentence.split("and");
        System.out.println(Arrays.toString(arrSen));






    }
}
