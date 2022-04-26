package day05ifelsestatement;

public class IfElseStatement01 {
    public static void main(String[] args) {

        //I can move from North Carolina to Virginia by a car or bus

        boolean car=false;

        boolean bus=true;

        //  false   true
        if ( car || bus ) {
            System.out.println("I can go to Virginia");
        }


        // I have cash money, I also have debit card.
        //I will buy a PC

        boolean cash=false;
        boolean debit=false;

        if (cash || debit) {
            System.out.println("I can buy a PC");
        }
        else {
            System.out.println("I cannot buy a PC");
        }


    }
}
