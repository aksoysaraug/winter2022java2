package day21varargsstringbuildersaccessmodifiers;


public class StringBilder1 {
    public static void main(String[] args) {

        /*
        String Class is "immutable" but StringBuilder Class is "mutable".
         */

    String s="Ali";
        System.out.println(s+"!"); //A new area will created in memory, the existing String s will not change.
        System.out.println(s+"!"+"?");    //Another new area will created.

        s = s+"!";  // If you do assignment that means you are insisting
                    // and Java will except it and will update th value of the String.


//        How to create a StringBuilder Object
//        1.Way:
        StringBuilder sb1= new StringBuilder("Veli");
        System.out.println(sb1);

//        2.Way:
        StringBuilder sb2= new StringBuilder();

        System.out.println("For empty StringBuilder: "+sb2.capacity()); //16

        sb2.append("Veli");
        sb2.append(" Han").append("!...");
        System.out.println(sb2);

        System.out.println(sb2.length()); //12
        System.out.println("For non-empty StringBuilder: "+sb2.capacity()); //16

//       3.Way:
        StringBuilder sb3= new StringBuilder(2 );
        sb3.append("FL");
        System.out.println(sb3.length()); //2
        System.out.println(sb3.capacity()); //2

        sb3.append("!");
        System.out.println(sb3.length()); //3
        System.out.println(sb3.capacity()); //2*2+2=6

        StringBuilder sb4= new StringBuilder("Mississippi");
        System.out.println(sb4.lastIndexOf("s")); //6
//        Take the first 3 indexes, return the index of last occurence of "s" in the first 3 indexes
        System.out.println(sb4.lastIndexOf("s",4));//3

        sb4.insert(2,"XXX");
        System.out.println(sb4); //MiXXXssissippi

        sb4.insert(1,"ABCDE",1,3);
        System.out.println(sb4); //MBCiXXXssissippi

        sb4.delete(4,7);
        System.out.println(sb4); //MBCississippi

        sb4.deleteCharAt(1);
        sb4.deleteCharAt(1);
        System.out.println(sb4); //Mississippi

        sb4.replace(2,4,"S");
        System.out.println(sb4); //MiSissippi

        sb4.reverse();
        System.out.println(sb4); //ippissiSiM

        StringBuilder sb5= new StringBuilder("Ali Can");
        StringBuilder sb6= new StringBuilder("Ali Can");
        StringBuilder sb7= new StringBuilder("Dli Can");

       /* System.out.println(sb5.compareTo(sb6)); //0

        System.out.println(sb5.compareTo(sb7)); //-3, 3 is for the differrence between the ASCII values
        System.out.println(sb7.compareTo(sb5)); //3*/

        String newString= sb5.substring(3); //substring method will give you a String.
        // Therefor you can not assign it to a StringBuilder.
        System.out.println(newString); // Can, substring is a method from String Class.
        // Therefor it is immutable and doesn't update the StringBuilder.
        System.out.println(sb5); //Ali Can

//       Convert StringBuilders to String by using toString ()
        String stringFromStringBuilder=sb5.toString();

//       Convert String back to StringBuilder by using StringBuilder() constructor
        StringBuilder stringBuilderFromString=new StringBuilder(stringFromStringBuilder);




    }

}
