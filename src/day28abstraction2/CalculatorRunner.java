package day28abstraction2;

public class CalculatorRunner {
    public static void main(String[] args) {

        Calculator calculator=new Profit();
        System.out.println(calculator.addition(2, 3)); //5
        System.out.println(calculator.multiplication(2, 3)); //6
        System.out.println(calculator.subtraction(5,9)); //-1
        System.out.println(calculator.division(6,3)); //-1


        System.out.println("===========");

        Calculator calculator2=new Loss();
        System.out.println(calculator2.addition(2, 3)); //-1
        System.out.println(calculator2.multiplication(2, 3)); //-1
        System.out.println(calculator2.subtraction(5,3)); //2
        System.out.println(calculator2.division(9,3)); //3

    }
}
