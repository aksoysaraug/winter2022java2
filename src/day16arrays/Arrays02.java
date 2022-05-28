package day16arrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

//        Find if the given array contains a spesific value or not?
        int arr[] = {34, 40, 5, 12, 32};

        int expectedElement=12;
//      1. Way
        int flag=0;
        for (int w:arr   ) {
            if (w==expectedElement){
                flag= flag+1;
            }
        }

        if (flag>1){
            System.out.println("Array contains "+ expectedElement);
        }else{
            System.out.println("Array doesn't contains "+ expectedElement);
        }

//        2.Way:

        Arrays.sort(arr);

        System.out.println("Binary search result: "+ Arrays.binarySearch(arr,expectedElement));



    }
}
