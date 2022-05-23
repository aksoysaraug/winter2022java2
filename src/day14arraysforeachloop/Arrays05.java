package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays05 {

    public static void main(String[] args) {

//        How to create an array and put elements in it in one line
        int a[]={12,7,0,32}; //[12, 7, 0, 32]

        int b[]={12,7,0,32};

//        How to check if two arrays are same or not
        boolean areArraysSame= Arrays.equals(a,b); //true
        System.out.println(areArraysSame);

//        Type code to check if 2 arrays have same elements
        //First sort the methods and then check if they are same

        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a,b)){
            System.out.println("Same arrays");
        } else {
            System.out.println("Different arrays ");
        }

        //Type code to check if a specific element exists in an array or not

        int c[]={-12,21,0,-2,34};

        int num=34;
        int counter=0; //Flag is used to test if a part of code worked or not,
                       //if counter will stay zero, it means counter increament
                        //was not executed anytime.

        for(int w : c){
            if(num==w){
            counter++;
            break;}
            }
        if(counter==0){
            System.out.println(num+" does not exist");
        } else{
            System.out.println(num+" exists");
        }




    }

}
