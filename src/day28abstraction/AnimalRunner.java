package day28abstraction;

public class AnimalRunner {
    public static void main(String[] args) {

        Animal animal1=new Cat("meow","Shero");

        animal1.animalName(); //Name of animal is Shero
        animal1.animalSound(); //Sound of animal is meow

        System.out.println("=========");

        Animal animal2=new Sheep("meee","Shaun");

        animal2.animalSound(); //Sound of animal is meee
        animal2.animalName();  //Name of animal is Shaun

        System.out.println("==========");

        Sheep sheep=new Sheep("baa","Dolly"); // When we use Sheep as data type instead of Animal,
                                                            // we van also reach the variables.

        System.out.println(sheep.name); //Dolly
        System.out.println(sheep.sound); //baa
        sheep.animalName(); //Name of animal is Dolly
        sheep.animalSound(); //Sound of animal is baa



    }
}
