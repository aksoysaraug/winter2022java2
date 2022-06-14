package day22inheritance;

public class AnimalRunner {
    public static void main(String[] args) {

    Dog dog1=new Dog();
    dog1.bark();
    dog1.feedBabyWithMilk();
    dog1.eat();
    dog1.drink();

        System.out.println("=========");

    Cat cat1=new Cat();
    cat1.feedBabyWithMilk();
    cat1.meow();
    cat1.drink();
    cat1.eat();

        System.out.println("=========");

    Bird bird1= new Bird();
    bird1.tweet();
    bird1.drink();
    bird1.eat();

    }
}
