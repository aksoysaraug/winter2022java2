package day17multidimensionalarrayslists;

import java.util.Arrays;

public class MultiDimensionalArray01 {
    public static void main(String[] args) {

//    Hot to create a multidimensional array
        int mda[][]=new int[3][2];

//   How to print multidimensional array on the console
        System.out.println(Arrays.deepToString(mda));

//   How to assign values

        mda[0][1]=9;

        System.out.println(Arrays.deepToString(mda)); // [[0, 9], [0, 0], [0, 0]]
        mda[0][0]=11;
        mda[1][0]=5;
        mda[1][1]=4;
        mda[2][0]=1;
        mda[2][1]=21;
        System.out.println(Arrays.deepToString(mda)); //[[11, 9], [5, 4], [1, 21]]

//   How to create multidimensional array in short way

     int mda1[][]={{2,3},{12},{21,34,56},{4}};

        System.out.println(Arrays.deepToString(mda1)); //[[2, 3], [12], [21, 34, 56], [4]]

//      How to print a spesific inner array on the console

        System.out.println(Arrays.toString(mda1[2]));

//        How to find the number of elements in a multidimensional array
//        Example; [[2, 3], [12], [21, 34, 56], [4]} ==>must be 7

        int sum=0;
        for (int[] w : mda1){
            sum=sum+w.length;
        }
        System.out.println(sum);



    }
}
