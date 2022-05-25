package day14arraysforeachloop;

public class StudentRunner {
    public static void main(String[] args) {


//      To access static class members "class name" is enough to access
        System.out.println(Student.counter); //Student is the class name , and there is the variable counter.
                                             //Because it is static you can access it this way.

//      To access non-static class members you have to create an object
        Student std1=new Student();
        System.out.println(std1.setStudentId());


    }
}
