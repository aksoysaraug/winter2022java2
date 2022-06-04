package day18arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {

//        Find the closest 2 integers in the given list. [12, 15, 10, 21]

        List<Integer> list=new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(10);
        list.add(20);

        Collections.sort(list); // first you have to sort
//        1.Way:
//        If you want to work with minimum value make the initial value maximum
        int minDiff=Integer.MAX_VALUE;

//       If you need to use consecutive indexes in a loop,
//       make the starting value 1 and use "i-1" and "i" as indexes
        for (int i=0;i< list.size()-1;i++){
            if(list.get(i+1)-list.get(i)<minDiff){
                minDiff=list.get(i+1)-list.get(i);
            }
        }

        for (int k=0;k< list.size()-1;k++){
            if (list.get(k+1)-list.get(k)==minDiff){
                System.out.println("The closest 2 integers are "+list.get(k)+" and "+list.get(k+1));
            }


        }

//        2.Way:
        int minDiff2=Integer.MAX_VALUE;

        for (int i=1; i< list.size();i++){
            minDiff2=Math.min(minDiff2, list.get(i)- list.get(i-1));
        }

        for (int k=1; k< list.size(); k++){
            if (list.get(k)- list.get(k-1)==minDiff2){
                System.out.println("The closest 2 integers are "+list.get(k-1)+" and "+list.get(k));
            }

        }

    }
}
