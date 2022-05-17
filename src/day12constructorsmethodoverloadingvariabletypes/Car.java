package day12constructorsmethodoverloadingvariabletypes;

public class Car {

//  Variables in the class Car
    String make; // passive features for the class Car, here are reserved areas created for the values
    String model; // passive features for the class Car
    double price; // passive features for the class Car
    int year;     // passive features for the class Car

//    1. Constructor: That constructor is same with the default constructor, it is very simple
    public Car(){
    }

//    2. Constructor: This is an advanced constructor
    public Car(String make,String model,double price,int year){
        this.make=make;
        this.model=model;
        this.price=price;
        this.year=year;
    }

//    3. Constructor:
    public Car (String make, String model){
        this.make=make;
        this.model=model;
    }


    public static void main(String[] args) {  // Main method

        Car c1 = new Car();  // created an object from first constructor
        c1.make = "Honda";
        c1.model = "Civic";
        c1.price = 10000;
        c1.year = 2015;


        Car c2 = new Car();   //created another object from first constructor
        c2.make = "Audi";
        c2.model = "S5";
        c2.price = 20000;
        c2.year = 2019;

        Car c3 = new Car("BMW","M4",70000,2019); // created an object from second constructor

        Car c4 = new Car("Tofas","Sahin"); // object created from third constructor




    }

}
