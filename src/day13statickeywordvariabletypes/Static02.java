package day13statickeywordvariabletypes;

public class Static02 {
    public static void main(String[] args) {


        Static01 obj4=new Static01();
        System.out.println(obj4.sCounter); //1
        System.out.println(obj4.iCounter); //1
        // Here you use the Ram memory. In every clicking on run button everything is starting from the beginning.
        // From the Ram memory all data will be cleared and then for that execution everything will start from the beginning.
        // If you use permanent memory in applications then nothing will be cleared, but now we are using Ram memory



    }
}
