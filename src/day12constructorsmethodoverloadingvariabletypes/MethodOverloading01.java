package day12constructorsmethodoverloadingvariabletypes;

public class MethodOverloading01 {
    public static void main(String[] args) {

        System.out.println(add(3,5));
        System.out.println(add(2,3,4));

        System.out.println(add(1.2,2.3));

        System.out.println(add(4,3.4));// Java will can also choose the third one, but it will choose the forth method,
                                             // because in the forth one is exact match, in the third method Java has
                                             // to do Auto Windening, Auto Widening is extra task for Java, but Java
                                             // everytime wants to work less.





    }

    //        Create an add method which adds 2 integers
  public static int add(int a, int b){
        return a+b;
  }

    //        Create an add method which adds 3 integers
    public static int add (int a, int b, int c){
        return a+b+c;
    }
    //        Create an add method which adds 2 integers

    public static double add(double a, double b){
        return a+b;
    }
//        Create an add method which adds 1 integer and 1 double

    public static double add(int a, double b){
        return a+b;
    }

    //        Create an add method which adds 1 integer and 1 double

    // The third code doesn't work with this method. By value 4 Java will do Auto Widening, it works,
    // but value 3.4 doesn't match with this method, you can not put a double to integer.
    public static double add(double a, int b){
        return a+b;
    }
}
