package day24objectmanipulations;

import java.util.ArrayList;
import java.util.List;

public class MainRunner4Repeat {
    public static void main(String[] args) {

        /*
Ask user to type 3 names and 3 last names.
Then concatenate the names with lastnames and add also "@gmail.com".
 */
        Person person1=new Person("Ali","Can");
        Person person2=new Person("Veli","Han");
        Person person3=new Person("Elif Sevil","Tekin");

        List<Person> people=new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);

        System.out.println(createEmail(people));

    }
    public static ArrayList<String> createEmail(List<Person> p){
        ArrayList<String> emails=new ArrayList<>();
        for (Person w:p){
            emails.add((w.name+w.lastname+"@gmail.com").replaceAll("\\s","").toLowerCase());
        }
        return emails;
    }
}
