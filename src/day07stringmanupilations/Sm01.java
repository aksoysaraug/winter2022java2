package day07stringmanupilations;

import java.util.Scanner;

public class Sm01 {

    public static void main(String[] args) {

       //1. Example: Print the first and last character of the given String on the console. “Java is easy” ==> Jy
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a String");

        // 1. Way: Using charAt(0)
        String str= scan.nextLine();
       char firstChar=str.charAt(0);

        System.out.println(firstChar);

        char lastChar= str.charAt(str.length()-1);
        System.out.println(lastChar);


        // 2. Way: Using substring()

        String firstChar2= str.substring(0,1);
        System.out.println(firstChar2);

        String lastChar2= str.substring(str.length()-1,str.length());
        System.out.println(lastChar2);


        // 2. Example: Type code to get initials of the first name and the last name of a given name.
        // Ali Can ===> AC Mary Star ===> MS

       String initialFn= str.toUpperCase().substring(0,1);
       String initialLn= str.toUpperCase().substring(str.indexOf(" ")+1,str.indexOf(" ")+2);

        System.out.println(initialFn+initialLn);

        // 3.Example: Check if any character exists in a String or not
        // 1. Way: indexOf()
        int check= str.indexOf("x");

        if (check==-1){
            System.out.println("The character doesn't exist");
        } else {
            System.out.println("The character exist");
        }

        // 2.Way: contains()
        boolean isContain= str.contains("x");
        if(isContain){
            System.out.println("The character exist");
        }else {
            System.out.println("The character doesn't exist");
        }







    }

}
