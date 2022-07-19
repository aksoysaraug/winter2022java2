package day29collections;

import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {

        LinkedList<String> ll1=new LinkedList<>();
        ll1.add("Ali");
        ll1.add("Can");
        ll1.add("Mark");
        ll1.add("Tom");

//        print and see all elements on the console
        System.out.println(ll1);  //[Ali, Can, Mark, Tom]


//        to get first element of the list without removing any element (copy-paste)
        String firstElement= ll1.element();
        System.out.println(firstElement); //Ali
        System.out.println(ll1);  //[Ali, Can, Mark, Tom]

//       to return the first element by removing the element from the list (cut-paste)
        String firstElement2= ll1.poll();
        System.out.println(firstElement2);  //Ali
        System.out.println(ll1);  //[Can, Mark, Tom]

//       to return first element of the list without removing any element (copy-paste)
        String firstElement3=ll1.peek();
        System.out.println(firstElement3); //Can
        System.out.println(ll1);  //[Can, Mark, Tom]

        LinkedList<String> ll2 =new LinkedList<>();
//        System.out.println(ll2.element()); //returns NoSuchElementException

        System.out.println(ll2.peek()); // This method returns String value, therefore if
                                        // there is no element, you will get "null" as result

        System.out.println(ll2.poll()); //This will also return "null"

//        to remove spesific element from an index

        LinkedList<Integer> ll3=new LinkedList<>();
        ll3.add(0,12); // We can place the elements at specific indexes
        ll3.add(1,13);
        ll3.add(2,10);
        ll3.add(3,11);

        System.out.println(ll3);

        Integer first= ll3.removeFirst(); //It will retrieve the first element and
                                          // will remove it from the list
        System.out.println(first);
        System.out.println(ll3);

//        to remove by typing index number
        Integer removedElements=ll3.remove(2);
        System.out.println(removedElements);
        System.out.println(ll3);




    }


}
