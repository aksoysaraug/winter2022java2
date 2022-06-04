package day18arraylists;

import java.util.ArrayList;

public class ArrayList04 {
    public static void main(String[] args) {

        //Increase the value of every element by 3 except 7

        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(10);
        list.add(7);
        list.add(9);

        System.out.println(list);

        for (int i=0; i<list.size();i++){
            if (list.get(i)==7){
                continue;
            }else{
                list.set(i,list.get(i)+3);
            }
        }

        System.out.println(list);


    }
}
