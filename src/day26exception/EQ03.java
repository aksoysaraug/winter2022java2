package day26exception;

public class EQ03 {
    public static void main(String[] args) {

    String str="";
    getNumOfCharactersInAString(str); //0

    String s="Ali";
    getNumOfCharactersInAString(s); //3

    String t=null;
    getNumOfCharactersInAString(t); //There is nothing, you can not count the length of null, you will get NullPointerException

    }
    public static void getNumOfCharactersInAString(String str) {
        try {
            System.out.println(str.length());
            ;
        } catch (NullPointerException e) {
            System.err.println("Issue occured when I count the  number of characters ==>");
            e.printStackTrace(); // if you want to see details about the issue, you can use this method
        }
    }
}
