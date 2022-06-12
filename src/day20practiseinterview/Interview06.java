package day20practiseinterview;

import java.util.Scanner;

public class Interview06 {
    public static void main(String[] args) {
        /*
            Ebay Interview Questions
   Get a String and a character from user
   Count the number of characters between the first occurence and the last occurence of the given character in the String
   Do not count the space characters
   If the character which user selected is displayed just once in the String return -1
   If the character which user selected does not exist in the String return -1
   For example; "Java is easy" - 'a' ==> 5
                "Java is easy" - 'w' ==> -1
                "Java is easy" - 'e' ==> -1
*/
//      My Way:
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");
        String s=scan.nextLine().toLowerCase().replaceAll("\\W","");

        System.out.println("Enter a character");
        String ch= scan.next();


        String srr[]=s.split("");

        int counter=0;
        for (String w:  srr) {
            if(w.equals(ch)){
                counter++;
            }
        }

        int numberOfCharacters=0;

        if (counter>1){
            numberOfCharacters=s.lastIndexOf(ch)-s.indexOf(ch)-1;
            System.out.println(numberOfCharacters);
            } else {
            System.out.println("-1");
        }

//        Second Way:
        System.out.println(  numberOfChar(s,ch));

    }
// Second Way:
    public static int numberOfChar(String s,String ch){
        int firstIndex=s.indexOf(ch);
        int lastIndex=s.lastIndexOf(ch);

        int counter=0;
        if(firstIndex==lastIndex){
            return -1;
        } else{

            for (int i=firstIndex+1; i<lastIndex;i++){
                if (s.charAt(i)!=' '){
                    counter++;
                }

            }
            return counter;

        }



    }






}
