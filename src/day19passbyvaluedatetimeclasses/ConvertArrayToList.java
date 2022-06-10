package day19passbyvaluedatetimeclasses;

import java.util.Arrays;
import java.util.List;

public class ConvertArrayToList {
    public static void main(String[] args) {

        Integer arr[]={3,4,5,6};

       List<Integer> list= Arrays.asList(arr);

////       Try to remove an element from list
//        list.remove(1);     ==>The length will be change, therefor you can not use this method
//        System.out.println(list);

////      Try to add an element into the list
//        list.add(7);          ==>The length will be change, therefor you can not use this method
//        System.out.println(list);

////        Try to delete all elements from the list
//        list.clear();          ==>The length will be change, therefor you can not use this metho
//        System.out.println(list);

//      You can use set(), replace(), indexOf() methods.
//        If a method effects the length you can not use it
    }
}
