package day14arraysforeachloop;

public class Student {

    String name;
    int year;
    static int counter= 1000;
    String studentId;

    public String setStudentId(){
        counter++;
        studentId= year + ""+ counter;
        return studentId;




    }



}
