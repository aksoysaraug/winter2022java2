package day15arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

//        How to check an element if it is exists in an array or not

        int arr[]={1,2,3,4,5};

//        1.Way:
        for(int w: arr){
            if(w==3){
                System.out.println(w+" exists");
            break;}
        }

//         2.Way: binarySearch() method returns the index of existing element
//        To use this method you HAVE TO use first sort() method, otherwise won't be meaningfull
        Arrays.sort(arr);
        System.out.println( Arrays.binarySearch(arr,3)); // 2 means it exists and have the index 2




    }
}
