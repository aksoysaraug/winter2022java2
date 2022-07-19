package day29_30iteratormynotes;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIterator01 {
    public static void main(String[] args) {

//        Review slide number 326
//        Update a collection

        List<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(31);

        System.out.println(list); //[3, 5, 8, 2, 31]

//      Modify a collection by using for-each loop.

        for (int w:   list) {
            w=w+3;
        }
        System.out.println(list); //[3, 5, 8, 2, 31] , we cannot change the value by using for-each

//       Modify a collection by using for loop.
        for (int i=0; i<list.size(); i++){
            list.set(i,list.get(i)+3);
        }
        System.out.println(list); //[6, 8, 11, 5, 34] By using set method, you can modify the list

//      Modify a collection by using iterator().

        ListIterator<Integer> iterator=list.listIterator();
        while(iterator.hasNext()){
            iterator.set(iterator.next()+3);
        }

        System.out.println(list); //[9, 11, 14, 8, 37]

    }
}
