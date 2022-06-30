package day26exception;

public class EQ1 {
    public static void main(String[] args) {
        divide(12,3); //4
        divide(0,3); //3
        divide(12,0); //No answer in Math you have to handle


    }
    //    Following code is not recommended because it needs deep math knowledge
  /*  public static void divide(int a, int b){
        if (b==0){
            System.out.println("Divisor cannot be zero");
        }else {
            System.out.println(a / b);
        }
    }
   */
    public static void divide(int a, int b){

        try{
            System.out.println(a / b);
        } catch(ArithmeticException e){
            System.out.println("Could not divide ==> "+ e.getMessage());
        }
    }
}
