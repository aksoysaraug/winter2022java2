package day18arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList02 {
    public static void main(String[] args) {

        /*
        Ask user to enter a letter
	 	If the letter exists in list convert it to “Got it”
	 	otherwise add the element user entered into the list

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a letter");
        String let=scan.next();

        ArrayList<String> list=new ArrayList<>();
        list.add("A");
        list.add("K");
        list.add("R");
        list.add("S");

        if(list.contains(let)){
            list.set(list.indexOf(let),"Got it");
        }else{
            list.add(let);
        }
        System.out.println(list);



    }
}
