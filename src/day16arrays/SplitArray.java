package day16arrays;

import java.util.Arrays;

public class SplitArray {
    public static void main(String[] args) {

    String words="I go to school";
    String srr[]=words.split(" ");

        System.out.println(Arrays.toString(srr));

        String names="Ibrahim#Settar#Filiz#Kerem";
        String srr2[]=names.split("#");

        System.out.println(Arrays.toString(srr2));

        String name="Ummugulsum";
        String srr3[]=name.split("");
        System.out.println(Arrays.toString(srr3));

        String sentences="I go to school and I talk to friends and I talk to teacher";
        String srr4[]=sentences.split("and");
        System.out.println(Arrays.toString(srr4));

    }
}
