package day17multidimensionalarrayslists;

import java.util.ArrayList;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {

//        How to create an ArrayList
//        1.Way
        ArrayList<Integer> al1= new ArrayList<>();

//        2. Way
        ArrayList<Integer> al2= new ArrayList<Integer>();

//        3.Way
        List<Integer> al3= new ArrayList<>();

//        How to print an ArrayList
        System.out.println(al1); //[]

//        How to add elements into an ArrayList
        al1.add(11); //[11]
        al1.add(12); //[11, 12]
        al1.add(5);  //[11, 12, 5]
        System.out.println(al1); //[11, 12, 5]

        al1.add(1,99);
        System.out.println(al1); //[11, 99, 12, 5]

//        How to get the number of elements in an ArrayList
        int numOfElements= al1.size();
        System.out.println(numOfElements); //4

        System.out.println(al2.size()); //0

//        How to check if an ArrayList is empty or not
//        1.Way:
        if (al1.size()==0){
            System.out.println("It is empty");
        } else{
            System.out.println("It is not empty");
        }

//        2.Way:
        al1.isEmpty();
        if (al1.isEmpty()){
            System.out.println("It is empty");
        } else{
            System.out.println("It is not empty");
        }

//        How to check if an ArrayList has space in it
        List<String> al4=new ArrayList<>(); //[]
        al4.add(" "); //[  ]
        al4.add("a"); //[  , a]

        for (String w: al4) {
            if (w.equals(" ")) {
                System.out.println("There is space");
                break;
            }
        }
//         Create a String ArrayList, add 5 elements into it,
//         remove a spesific element
            List<String> al5=new ArrayList<>();
            al5.add("Christian");
            al5.add("Alex");
            al5.add("Tommy");
            al5.add("Adriana");
            al5.add("Tom");
            System.out.println(al5); //[Christian, Alex, Tommy, Adriana, Tom]

        al5.remove("Alex"); // if you print this it will print true
        System.out.println(al5); //[Christian, Tommy, Adriana, Tom]

//        How to remove an element by index
        al5.remove(1);//if you print this it will print Tommy
        System.out.println(al5); //[Christian, Adriana, Tom]

//        Create an Integer ArrayList, add 5 elements into it, remove a spesific element

        List<Integer> al6=new ArrayList<>();
        al6.add(12);
        al6.add(13);
        al6.add(7);
        al6.add(32);
        al6.add(1);

        System.out.println(al6); //[12, 13, 7, 32, 1]

        al6.remove(1);
        System.out.println(al6); //[12, 7, 32, 1]

//        How to remove a spesific integer element from integer list
//        1. Step: Create an Integer Wrapper Class Object by using the value which you want to remove
        Integer el=new Integer(32); // Integer el= Integer.valueOf(32);
//        2.Step: Use the created Integer object inside the remove()
        al6.remove(el);
        System.out.println(al6); // [12, 7, 1]

//       Create a String ArrayList, add 5 elements into it, remove the elements whose lengths are less than 5
        List<String> al7 = new ArrayList<String>();
        al7.add("Christian");
        al7.add("Alex");
        al7.add("Tommy");
        al7.add("Adriana");
        al7.add("Tom");
        System.out.println(al7);// [Christian, Alex, Tommy, Adriana, Mary]

//      Clone the al7 and use the cloned ArrayList inside the loop
        List<String> clonedAl7 = new ArrayList<String>(al7);

        for(String w: clonedAl7){
            if (w.length()<5){
                al7.remove(w);
            }
        }
        System.out.println(al7);


    }

}
