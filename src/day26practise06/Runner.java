package day26practise06;

public class Runner {
    public static void main(String[] args) {

        Circle obj = new Circle(2);
        System.out.println("Circle Radius: " + obj.getRadius()); //2
        System.out.println("Circle Area: " + obj.getArea()); //12.566370614359172

        Circle obj2 = new Circle(-2);
        System.out.println("Circle Radius: " + obj2.getRadius()); //0
        System.out.println(obj2.getArea()); //0


        Cylinder obj3 = new Cylinder(2, 5);
        System.out.println("Cylinder Radius: "+obj3.getRadius()); //5
        System.out.println("Cylinder Height: "+obj3.getHeight()); //2
        System.out.println("Cylinder Volume: "+obj3.getVolume()); //157.07963267948966
        System.out.println("Cylinder Area: "+obj3.getArea()); //219.9114857512855 ==> I overrided the getArea() method from parent class

        Cylinder obj4=new Cylinder(2,-5);
        System.out.println("Cylinder Volume: "+obj4.getVolume()); //0

        System.out.println(Math.PI);
    }
}
