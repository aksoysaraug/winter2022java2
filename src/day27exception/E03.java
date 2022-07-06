package day27exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E03 {
    public static void main(String[] args) {

        goAndReadTheFile();

        System.out.println("Hello");
    }
    public static void goAndReadTheFile(){

        try {
            FileInputStream fis=new FileInputStream("src/day27exception/File00.txt"); //Go and find the file

            int k;

            while((k=fis.read()) != -1){   //read() method will give you the ASCII value of every character,
                                 // and if it is not equal to -1, loop will work. Then inside the loop body you
                                 // are converting the ASCII value to char and printing it.
                System.out.print((char)k);

            }
            System.out.println();

        } catch (FileNotFoundException e) {
            System.out.println("There is an issue about reaching out the file or existence of the file "+e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Connection with cloud was broken");
        }
    }
}
