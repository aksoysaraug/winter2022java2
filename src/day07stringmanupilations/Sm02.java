package day07stringmanupilations;

public class Sm02 {
    public static void main(String[] args) {

        String str= "Ali Can";
        String newStr= str.concat("!...").concat("Wow");
        System.out.println(newStr);

        boolean isLast= str.endsWith("Can");
        System.out.println(isLast);

        boolean isFirst=str.startsWith("Ali");
        System.out.println(isLast);

        boolean isTheForst= str.startsWith("Ca",4);
        System.out.println(isTheForst);


    }


}
