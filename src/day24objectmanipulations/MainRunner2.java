package day24objectmanipulations;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainRunner2 {
    public static void main(String[] args) {
        /*
        Ask user to type 2 name and 2 last name.
        Then create an email for the user.
        Concatenate the name and lastname then add @gmail.com
         */

        List<String> names=new ArrayList<>();

        List<String> lastnames=new ArrayList<>();

        Scanner scan=new Scanner(System.in);
        System.out.println("Please type 2 names");
        names.add(scan.nextLine());
        names.add(scan.nextLine());

        System.out.println("Please type 2 names");
        lastnames.add(scan.next());
        lastnames.add(scan.next());

        System.out.println("user name: "+names);
        System.out.println("user lastname: "+lastnames);

        System.out.println(generateEmail(names, lastnames));

    }
    public static List<String> generateEmail(List<String> names, List<String>lastnames){
        List<String> emails=new ArrayList<>();
        for (int i=0; i< names.size();i++){
            emails.add((names.get(i)+lastnames.get(i)+"@gmail.com").replaceAll("\\s","").toLowerCase());
        }
        return emails;

    }
}
