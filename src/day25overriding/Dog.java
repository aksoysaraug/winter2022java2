package day25overriding;

public class Dog extends Mammal{

    @Override
    public void eat() {
//        super.eat(); By using this statement you can keep the existing method body and
//                      them you can create your new implementation
        System.out.println("Dogs eat");
    }

    public void bark(){
        System.out.println("Dogs bark");
    }


}
