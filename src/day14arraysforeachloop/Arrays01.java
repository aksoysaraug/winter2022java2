package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        int myArray[]=new int[5];

        System.out.println(Arrays.toString(myArray)); //[0, 0, 0, 0, 0]

        myArray[1]=11;
        System.out.println(Arrays.toString(myArray)); //[0, 11, 0, 0, 0] Arrays uses indexes like Strings

        myArray[3]=21;
        System.out.println(Arrays.toString(myArray)); //[0, 11, 0, 21, 0]

        myArray[4]=1;
        System.out.println(Arrays.toString(myArray)); //[0, 11, 0, 21, 1]

        myArray[0]=41;
        myArray[2]=31;
        System.out.println(Arrays.toString(myArray)); //[41, 11, 31, 21, 1]

        System.out.println(myArray[2]); //31 ==> get a spesific element

        System.out.println(myArray.length); // 5 ==> get the number of elements , here will be use just lenght, without paranthesis


        //Print the sum of the first and the last element in an array on the console
        int firstElement= myArray[0];
        int idxOfLastElement= myArray.length-1;
        int lastElement= myArray[myArray.length-1];
        System.out.println(firstElement+lastElement);

        //Find the sum off all elements in an array [41, 11, 31, 21, 1]

        //1.Way: while loop
        int sum=0;
        int i=0;
        while (i< myArray.length){
            sum=sum+myArray[i];
            i++;
        }
        System.out.println(sum);

        //2.Way: for loop
        int sum1=0;
        for (int j=0; j< myArray.length; j++){
            sum1=sum1+myArray[j];
        }
        System.out.println(sum1);

        //3.do while loop
        int k=0;
        int sum2=0;
        do {
            sum2=sum2+myArray[k];
            k++;
        } while (k< myArray.length);

        System.out.println(sum2);

        //4. for-each-loop
        int sum3=0;
        for(int w: myArray){
            sum3= sum3+w;
        }
        System.out.println(sum3);



    }



}
