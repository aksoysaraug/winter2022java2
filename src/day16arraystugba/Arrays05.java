package day16arraystugba;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

//Find the vowels in a String by using arrays. a e i o u
//        Print the on the console

        String s = "Learn java, earn money.";
        String arr[]=s.split("");
        System.out.println(Arrays.toString(arr));

        int counter=0;
        for (String w: arr) {
            if (w.equals("a") || w.equals("e") || w.equals("i") || w.equals("o") || w.equals("u")) {
                System.out.print(w+" ");
                counter++;
            }
        }

        System.out.println();

        if(counter>0){
            System.out.println("The number of the vowels in the given String: "+ counter);
        } else{
            System.out.println("This String doesn't contain vowels");
        }
    }

}
