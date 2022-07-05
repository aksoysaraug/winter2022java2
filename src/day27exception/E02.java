package day27exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
    public static void main(String[] args) {

    Object obj=70; //Inheritance, Object class is the parent of all classes,
                    // therefor data type can be selected from parent class
    convertObjectToString(obj); //ClassCastException ==> Integer cannot be cast to String

       int a= (int) obj;
        System.out.println(a);


    }
    public static void convertObjectToString(Object obj){
       try {
           String s = (String) obj;  //Explicit type casting ==> Integer cannot be cast to String
           System.out.println(s);
       }catch(ClassCastException e){
           System.err.println("Convertion is impossible between those data types ==> "+e.getMessage());
       }
    }
}
