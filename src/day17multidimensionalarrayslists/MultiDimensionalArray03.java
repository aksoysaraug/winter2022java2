package day17multidimensionalarrayslists;

import java.util.Arrays;

public class MultiDimensionalArray03 {

    public static void main(String[] args) {

//      Find the maximum element in a 2 dimensional array
//        12:37
        int a[][] = { {5, 0}, {-5, 34}, {65, 22, 31} };

//        My Way:
        int sum=0;
        for (int w[]:a){
                sum=sum+ w.length;
        }

       int na[]=new int[sum];

        int k=0;
        for (int [] w:a) {
            for (int each : w) {
                na[k] = each;
                k++;
            }
        }
        Arrays.sort(na);
        System.out.println(na[na.length-1]);

//        Second Way:
        int x=Integer.MIN_VALUE; // When you calculate max element use min value as starting value
                                 // When you calculate min element use max value as starting value
                                 // You can start with the first element as well
        for (int []w: a){
            for (int m:w){
                if(m>x){
                    x=m;
                }
            }
        }
        System.out.println(x);


    }

}
