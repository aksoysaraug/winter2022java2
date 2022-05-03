package day08stringmanipulationsforloop;

public class Sm01 {

    public static void main(String[] args) {

        String str= "Ali is 13 years old, I think he is 15";

        //1. Example: Remove all space characters from the String

        String noSpace=str.replace(" ","");
        System.out.println(noSpace);

        //2. Example: Change digit to *

        // 1. Way: Hard coded which is not good
        String noDigit=str.replace("13","**").replace("15","**");
        System.out.println(noDigit);

        // 2. Way: Without hard coding
        String noDigitDynamic=str.replaceAll("[0-9]","*") ;
        System.out.println(noDigitDynamic);

        //3. Example: Change all letters to !
        String noLetters= str.replaceAll("[A-Za-z]","!");
        System.out.println(noLetters);

        //4. Example: Change all characters different from letters to ?
        String differentFromLetters=str.replaceAll("[^A-Za-z]","?");
        System.out.println(differentFromLetters);

        //5. Example: Change all characters different from digits to *
        String differentFromDigits=str.replaceAll("[^0-9]","*");
        System.out.println(differentFromDigits);

        //6. Example: Change all characters different from space to *
        //1. Way:
        String differentFromSpace=str.replaceAll("[^ ]","*");
        System.out.println(differentFromSpace);

        /*
            1) \\s means space in regular expression
            2) \\S means characters different from space character

            3) \\d means digits
            4) \\D means different from space character

            5) \\w means A-Z and a-z and 0-9 and _
            6) \\W means different from A-Z and a-z and 0-9 and _

            7) \\p{Punct} means all punctation marks


        */

        // 2.Way:
        String differentFromSpace2= str.replaceAll("\\S","*");
        System.out.println(differentFromSpace2);

        // 7. Example: How many characters are used in the String different from space?

       int numOfCharDiffFromSpace=  str.replaceAll("\\s","").length();
        System.out.println(numOfCharDiffFromSpace);

        // 8. Example: How many digits are used in the String?

        int numOfDigits= str.replaceAll("\\D","").length();
        System.out.println(numOfDigits);

        //9. Example: How many letters are used in the String?

        int numOfLetters= str.replaceAll("[^A-Za-z]","").length();
        System.out.println(numOfLetters);

        //10. Example: How many punctuation marks are used in the String?

        int totalNumOfChar=str.length();//37
        int numOfCharDifferentFromPunctuation= str.replaceAll("\\p{Punct}","").length();//36
        System.out.println(totalNumOfChar-numOfCharDifferentFromPunctuation);//1








    }



}
