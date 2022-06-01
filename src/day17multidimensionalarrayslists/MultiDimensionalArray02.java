package day17multidimensionalarrayslists;

import java.util.Arrays;

public class MultiDimensionalArray02 {
    public static void main(String[] args) {

//        Print the elements which have "a" from a 2 dimensional String array

        String arr1[][] = { {"learn","java","it"}, {"is", "easy"} };

        for (String[]w: arr1){

            for (String each: w){
                if(each.contains("a")){
                    System.out.print(each+" ");}
            }
        }

//      Convert arr1 to one dimensional array
//       ==> {"learn","java","it", "is", "easy"}

//        First find the total number of elements in an array

        int sum1=0;
        for (String[] w: arr1){
            sum1=sum1+w.length;
        }
//      Create a one-dimensional array whose length equals to the total number of elements in arr1
        String arr2[]= new String[sum1];

        int k=0;

        for(String[] w: arr1){
            for (String each: w){
                arr2[k]=each;
                k++;
            }
        }
            System.out.println(Arrays.toString(arr2));
    }
}
