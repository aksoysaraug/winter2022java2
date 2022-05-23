package day14arraysforeachloop;

public class StaticBlock01 {

    static double pi;
    static double eNumber;

    static{
        pi = 3.14;
    }
    static{
        eNumber= 2.7;
    }

    public static void main(String[] args) {

        double r= 2;
        double area = pi*r*r;


    }

}
