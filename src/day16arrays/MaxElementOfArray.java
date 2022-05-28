package day16arrays;

import java.util.Arrays;

public class MaxElementOfArray {

    public static void main(String[] args) {

//        Find the mx value of the array
        int[] array={12,23,9,34,29};
//        1. Way:
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        int max=array[array.length-1];
        System.out.println("Max value is "+max);

//        2.Way:
        int[] array2={12,23,9,34,29};

        int max2=array2[1];
        for (int i=0; i<array2.length; i++){
            if(max2<array2[i]){
                max2=array2[i];
            }
        }
        System.out.println("Max value is " + max2);

    }

}
