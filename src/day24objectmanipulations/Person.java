package day24objectmanipulations;

public class Person {

    public String name;
    public String lastname;

    public Person(){

    }
    public Person(String name, String b){
        this.name=name;
        lastname=b; //When the names isn't the same you don't need to type 'this' keyword
    }

    public static void main(String[] args) {

        Person person1= new Person();

        System.out.println(person1.name);
        System.out.println(person1.lastname);

        Person person2= new Person("Maha","Wael" );

        System.out.println(person2.name);
        System.out.println(person2.lastname);
    }

}
