package day21varargsstringbuildersaccessmodifiers;

import java.util.ArrayList;
import java.util.Collections;

public class Practise {
    public static void main(String[] args){


        //Find the smallest positive integer and greatest negative integer in a given integer list
        ArrayList<Integer> list=new ArrayList<>();
        list.add(-12);
        list.add(18);
        list.add(-5);
        list.add(23);
        list.add(-2);
        System.out.println(list); //[-12, 18, -5, 23, -2]

        Collections.sort(list);
        System.out.println(list);

        int minPos=list.get(list.size()-1);
        int maxNeg=list.get(0);

//        1. Way: My Way
        for (int i=0; i<list.size();i++){
            if (list.get(i)>0){
                if(list.get(i)<minPos){
                    minPos= list.get(i);
                }
            }else if(list.get(i)<0){
                if (list.get(i)>maxNeg){
                    maxNeg= list.get(i);
                }
            }
        }
        System.out.println("Minimum positive number is: "+minPos);
        System.out.println("Maximum negative number is: "+maxNeg);

//        2.Way:
        int minPos2=list.get(list.size()-1);
        int maxNeg2=list.get(0);

        for (int w:list){
            if (w>0){
                minPos2=Math.min(w,minPos2);
            } else if (w<0){
                maxNeg2=Math.max(w,maxNeg2);
            }
        }
        System.out.println("Minimum positive number is: "+minPos2);
        System.out.println("Maximum negative number is: "+maxNeg2);


    }
}
