package day15arraysforeachloop;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

//        Check if the array elements in natural order.

//        Correct Solution:
        String srr[]={"Ayhan", "Beyhan","Ceyhan"};

//        Create a new array and put the elements into the new array
        String arr[]=new String[srr.length];

//      If you want to keep original array same transfer the elements one by one
//        By using loop method you will have same elements in 2 different reserved area

        for (int i=0; i<srr.length;i++){
            arr[i]=srr[i];
        }

        System.out.println(Arrays.toString(arr));

        Arrays.sort(srr);
        if (Arrays.equals(srr,arr)){
            System.out.println("Array elements are in alphabetical order");
        } else {
            System.out.println("Array elements are not in alphabetical order");
        }
//      Correct soultion 2:

        String brr[]={"Ayhan", "Ceyhan","Beyhan"};

//        If you want to keep original array same, use the copyOf() method
//        By using copyOf() method you will have same elements in 2 different reserved area

        String crr[]=Arrays.copyOf(brr,brr.length);

        Arrays.sort(crr);
        if (Arrays.equals(brr,crr)){
            System.out.println("Array elements are in alphabetical order");
        } else {
            System.out.println("Array elements are not in alphabetical order");
        }



//        Wrong solution: This way will give you the wrong answer

        String urr[]={"Ayhan", "Ceyhan","Beyhan"};

//      If you assign an array into another array, they will use same reserved area.
        String mrr[]=urr;

        Arrays.sort(mrr);

        if (Arrays.equals(urr,mrr)){
            System.out.println("Array elements are in alphabetical order");
        } else {
            System.out.println("Array elements are not in alphabetical order");
        }





    }
}
