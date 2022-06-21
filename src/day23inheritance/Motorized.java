package day23inheritance;

public class Motorized extends Vehicle {

    public Motorized (int capacity){ //Here you don't need to type super, because Java puts it invisible.
//        In the parents class is a constructor without parameter, so Java puts here invisible constructor.
//        Invisible super is just for un-parametrized constructor.
        super("Be careful");// We just typed this to select the parametrized character.
        System.out.println("Motorized constructor with integer parameter");
    }

}
