package day15arraysforeachloop;

import java.util.Arrays;
import java.util.Comparator;

public class Arrays01 {
    public static void main(String[] args) {

        String srr[]={"Veli", "Michael","Ali","Maria"};
        System.out.println(Arrays.toString(srr));


//        Sort the array elements according to their lenghts.
//        ==> "Ali" "Veli" "Maria" "Micheal"

        Arrays.sort(srr, Comparator.comparingInt(String::length));
        System.out.println(Arrays.toString(srr));

//      Sort the array elements in descending order acoording to their
//        ==> "Micheal" "Maria" "Veli" "Ali"

        String trr[]={"Veli", "Michael","Ali","Maria"};

        Arrays.sort(trr,Comparator.comparingInt(String::length).reversed());

        System.out.println(Arrays.toString(trr));

//      Sort the array elements in descending order acoording to their lenghts.
//        If same elements are in same lenght put them in alfabetic order
//        "Micheal" "Maria" "Ayse" "Veli" "Ali" "Can"

        String urr[]={"Veli","Can","Michael","Ali","Maria","Ayse"};

        Arrays.sort(urr,Comparator.comparingInt(String::length).reversed().thenComparing(Comparator.naturalOrder()));
        System.out.println(Arrays.toString(urr));

    }


}
