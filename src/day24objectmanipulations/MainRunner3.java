package day24objectmanipulations;

import java.util.Scanner;

public class MainRunner3 {

    /*
    Ask user their name and lastname
    Then generate an email for them
    concatenate firstname and lastname and "@gmail.com"
    then print email for the user on the console
     */
    public static void main(String[] args) {
//        Person person=new Person();

        Scanner scan=new Scanner(System.in);
        System.out.println("Please type your name and lastname");
        Person person= new Person(scan.nextLine(), scan.nextLine());

        System.out.println(person.name);
        System.out.println(person.lastname);

        System.out.println("Email of the person: "+generateEmail(person));

    }
    public static String generateEmail(Person person){
       return (person.name+person.lastname+"@gmail.com").replaceAll("\\s","").toLowerCase();
    }

}
