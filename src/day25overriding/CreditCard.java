package day25overriding;

public class CreditCard {

    private String ccn="1234567891234567";
    private int age=21;
    private boolean isExpired=false;

    //    By using "getter methods" we can read
//    the value of encapsulated data from other classes.
    public String getCcn() {
        return ccn;
    }

//    By using "setter methods" we can update
//    the value of encapsulated data from other classes.
    public void setCcn(String ccn) {
        this.ccn = ccn;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }
}
