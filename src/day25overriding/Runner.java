package day25overriding;

public class Runner {
    public static void main(String[] args) {
        CreditCard ccn1= new CreditCard();
        System.out.println(ccn1.getCcn()); //1234567891234567

//      I want to make credit card number like ************4567
        String ccn = ccn1.getCcn();
        ccn1.setCcn("************"+ccn.substring(ccn.length()-4));

        System.out.println(ccn1.getCcn()); //************4567

//        I want to tell to user "Not visible"
        ccn1.setCcn("Not visible");
        System.out.println(ccn1.getCcn()); //Not visible
        CreditCard ccn2=new CreditCard();

        System.out.println(ccn2.getCcn()); //1234567891234567


        Animal sasha= new Dog();
        ((Dog)sasha).bark();

        Dog rocky= new Dog();
        rocky.bark();
    }
}
