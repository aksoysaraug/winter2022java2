package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

//         [0, 2, 3, 0, 12, 0] put the zeros to the end

        int arr1[]=new int[6];
        arr1[0]=0;
        arr1[1]=2;
        arr1[2]=3;
        arr1[3]=0;
        arr1[4]=12;
        arr1[0]=0;

        int arr2[]=new int[6];

        int x=0;

        for(int i=0; i<arr1.length ; i++){
            if (arr1[i]!=0) {
                arr2[x]=arr1[i];
                x++;
            }
        }
        System.out.println(Arrays.toString(arr2));




    }
}
