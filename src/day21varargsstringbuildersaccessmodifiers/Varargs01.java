package day21varargsstringbuildersaccessmodifiers;

public class Varargs01 {
    public static void main(String[] args) {

        add(); //0

        add(5); //5

        add(5,10); //15

        add(5,10,15); //30
    }

    public static void add(int...a) {
        int sum=0;
        for (int w: a){
            sum+=w;
        }
        System.out.println(sum);
    }
}
