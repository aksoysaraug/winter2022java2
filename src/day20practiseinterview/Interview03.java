package day20practiseinterview;

import java.util.Arrays;
import java.util.Scanner;

public class Interview03 {
    public static void main(String[] args) {
        /*	 	Create a function that takes an array and
        returns the difference between the biggest and the smallest numbers.
        Ask user to enter array elements.	*/

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int len= scan.nextInt();

        int arr[]=new int[len];
        int i=0;
        do {
            System.out.println("Enter the " +(i+1)+". element");
            arr[i]=scan.nextInt();
            i++;
        } while(i<len);


        System.out.println("The difference between the biggest" +
                " and the smallest numbers is "+ difference(arr));


    }
    public static int difference(int arr[]){
     Arrays.sort(arr);
        return arr[arr.length-1]-arr[0];
    }
}
