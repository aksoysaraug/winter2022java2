package day16arraystugba;

import java.util.Arrays;

public class Arrays08 {
    public static void main(String[] args) {

        //Type code to find if a given element exists in the given array
        int array [] = {34,52,12,37,29};
        int expectedElement = 12;

//        1.Way:
        for (int w:array         ) {
            if (w==expectedElement){
                System.out.println(expectedElement+ " element exists in the given array");
                break;
            }
        }


//        2.Way
        Arrays.sort(array);
        if(Arrays.binarySearch(array,expectedElement)>=0){
            System.out.println(expectedElement+ " element exists in the given array");
        } else{
            System.out.println(expectedElement+ " element doesn't exist in the given array");
        }




    }
}
