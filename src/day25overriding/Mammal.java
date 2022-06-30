package day25overriding;

public class Mammal extends Animal{
    int i=3;

    public void eat(){
        System.out.println("Mammal eats");
    }
    public void feedBabyWithMilk(){
        System.out.println("Mammal feed their baby with milk");
    }

    @Override
    public Animal myMethod() {
        return new Mammal();
    }
}
