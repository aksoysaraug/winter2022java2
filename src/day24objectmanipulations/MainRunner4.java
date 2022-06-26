package day24objectmanipulations;

import java.util.ArrayList;
import java.util.List;

public class MainRunner4 {
    public static void main(String[] args) {

/*
Ask user to type 3 names and 3 last names.
Then concatenate the names with lastnames and add also "@gmail.com".
 */

        List<Person> people=new ArrayList<>();

        Person person1=new Person("Fuat", "Koca");
        Person person2=new Person("Cagri", "Selcuk");
        Person person3=new Person("Cigdem", "Bakar");

        people.add(person1);
        people.add(person2);
        people.add(person3);
//        1.Way
        System.out.println(generateEmails(people));

//        2.Way
        List<String> emails=generateEmails(people);
        System.out.println("First email: "+emails.get(0));
        System.out.println("First email: "+emails.get(1));
        System.out.println("First email: "+emails.get(2));

    }
    public static List<String> generateEmails(List<Person> people){
        List<String> emails=new ArrayList<>();
       /*
       1. Way
        for (Person w: people){
            System.out.println((w.name+w.lastname+"@gmail.com").toLowerCase());
        }
       2. Way
        for (int i=0; i< people.size();i++){
            System.out.println((people.get(i).name+people.get(i).lastname+"@gmail.com").toLowerCase());
        }
*/
        for (Person w:people  ) {
            emails.add((w.name+w.lastname+"@gmail.com").replaceAll("\\s","").toLowerCase());
        }
        return emails;


    }



}
