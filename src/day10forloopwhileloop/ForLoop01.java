package day10forloopwhileloop;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
//      1.Example: Type code to find the sum of the integers from 12 to 231

        int sum=0; // After every sum operation I am finding a new value. To store that new value I need to create a reserved are.

        for (int i=12; i<232; i++){
            sum= sum + i;

        }
//      Note:If you put System.out.println(sumO); inside the loop you will see the sum value for every loop.
//      If you expect to see the sum value for every loop put it inside the loop, if you want to see
//      the final sum value put it outside
        System.out.println(sum);


//     2. Example: Type code to find the multiplication of the integers from 3 to 5

        int prod= 1;
        for (int i=3; i<6; i++) {

            prod=prod*i;
        }
        System.out.println(prod);

//  3. Example: Type code to check if a given String is Palindrome.
//		  String: anna  Reversed String: anna
//		 Intgeger: 12321  Reversed Integer: 12321

        String s="anna";
        String reversedS= "";

//      Find the reverse
        for (int i=s.length()-1; i>-1; i--){
            reversedS=reversedS+s.charAt(i);
        }
        System.out.println(reversedS);

        if (s.equals(reversedS)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }

//        4. Example: Type code to check if a given integer is Palindrome.
//		 Intgeger: 12321  Reversed Integer: 12321

        int num=12321;
        String stringFromNum= String.valueOf(num);
        String reversed= "";

        for (int i= stringFromNum.length()-1; i>-1; i--){
            reversed= reversed+stringFromNum.charAt(i);
        }
        if (stringFromNum.equals(reversed)){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

//        5.Example: Type code to find the sum of the digits of an integer
//                753==>7+5+3
        int n= 753;
        int sumOfDigits=0;

        for (int i=n;i>0 ; i=i/10){

            sumOfDigits = sumOfDigits + i%10;

        }
        System.out.println(sumOfDigits);

//       6. Example Type code to find the sum of the unique digits of an integer.

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter an Integer");
        int p = scan.nextInt(); // 9877

        String pS= String.valueOf(p); //"9877"
        int sumOfUnique=0;

        for (int i=0; i< pS.length(); i++){

            String c= pS.substring(i,i+1);

            if(pS.indexOf(c)==pS.lastIndexOf(c)){

                sumOfUnique = sumOfUnique + Integer.valueOf(c);

            }

        }
        System.out.println(sumOfUnique);


    }

}
