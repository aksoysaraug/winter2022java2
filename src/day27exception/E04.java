package day27exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E04 {
    public static void main(String[] args) throws IOException, ArithmeticException { // It means: Java if there is an exception you can ask to me.

        System.out.println("Hello world");

        FileInputStream fis=new FileInputStream("src/day27exception/File01.txt");

        int k;

        while((k=fis.read()) != -1){
            System.out.print((char)k);
        }


        System.out.println();
        System.out.println("==========");

        printTheAge(-12);

        System.out.println("Bye Bye");

    }

    public static void printTheAge(int age) {

        try {
            if (age >= 0) {
                System.out.println(age);
            } else {
                throw new IllegalArgumentException("Ages cannot be negative");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
