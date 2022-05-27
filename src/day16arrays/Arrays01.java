package day16arrays;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {


        int arr1[] = {5, 12, 32};
        int arr2[] = {5, 12, 32};

//      Find out if array values are the same or different
//        1.Way
        boolean flag = false;

        if (arr1.length == arr2.length) {

            for (int i = 0; i < arr1.length; i++) {

                if (arr1[i] != arr2[i]) {
                    flag = true;
                    break;
                }
            }

            if (flag) {
                System.out.println("The array values are different");
            } else {
                System.out.println("Array values are the same");
            }

        } else{
            System.out.println("Arrays are different");
        }
//        2.Way
        if(Arrays.equals(arr1,arr2)){
            System.out.println("Array values are the same");
        } else {
            System.out.println("The array values are different");

        }




    }

}
