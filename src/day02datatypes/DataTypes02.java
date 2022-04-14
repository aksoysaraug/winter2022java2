package day02datatypes;

public class DataTypes02 {

    public static void main(String[] args) {
// create a char variable and print it on the console
        char age='3';
        System.out.println(age);//51
        System.out.println(age+1);//52

        //type code to find the ASCII Value of '!'
        char a='!';
        System.out.println(a+1);


        //type code to find the sum of the ASCII Values of 'X' and 'y' and '?'
        char b='X',c='y',d= '?';
        System.out.println(b+c+d);

        //Create 2 integer variables whose values are 5 and 2 then print the result of first is divided by second  devided by second

        int i1=5, i2=2;
        System.out.println(i1/i2);//2

        /* When you use different data typesin matehmatical operations the result will be in the largest data type.
        Because of that the result data type will be double */

        double m=5;
        int n=2;
        System.out.println(m/n);//2,5

         //what is the output of the

        System.out.println(2+3+ "Ali");//5Ali

        System.out.println( 2+'a'+"B"+ (3+4));//99B7




    }


}

