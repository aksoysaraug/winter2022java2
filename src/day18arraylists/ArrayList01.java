package day18arraylists;


import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {

//         How to remove duplicates from Arraylist
//                [2,3,2,2,5]==> [2,3,5]

        ArrayList<Integer> originalList=new ArrayList<>();
        originalList.add(2);
        originalList.add(3);
        originalList.add(2);
        originalList.add(2);
        originalList.add(5);

        ArrayList<Integer> list1=new ArrayList<>();
//      1.Way
        for (int w:originalList){
            if (list1.contains(w)){
                continue;
            }else{
                list1.add(w);
            }
        }
        System.out.println(list1);

//        2.Way
        ArrayList<Integer> uniqueList=new ArrayList<>(originalList);

        int counter=0;
        for( Integer w: originalList) {
            for (int i = 0; i < uniqueList.size(); i++) {
                if(w.equals(uniqueList.get(i))){
                    counter++;
                }
            }
            if(counter>1) {
                for (int k = 1; k < counter; k++) {
                    uniqueList.remove(Integer.valueOf(w));
                }
            }
            counter=0;
        }

        System.out.println(uniqueList);
    }
}
