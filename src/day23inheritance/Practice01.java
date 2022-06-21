package day23inheritance;

public class Practice01 {
    int a=12;
    public void rest(){
        System.out.println("XXX");
    }
    public  Practice01(){

        System.out.println("A");
    }
    public Practice01(int a){
        this();
            System.out.println("B");
    }
}



    class Practice02 extends Practice01{
        int a=13;
        public void rest(){

            System.out.println("YYY");
        }
        public Practice02(){

            System.out.println("C");
        }
        public Practice02(int i){
            super(11);
            System.out.println("E");
        }
    }



    class Practice03 extends Practice02{
        int a=14;
        public void rest(){
            System.out.println("ZZZ");
        }
        public Practice03(String s){
            super(11);
            System.out.println("D");
        }
    }


    class Runner {
        public static void main(String[] args) {

            Practice03 obj1 = new Practice03("Woow!"); //ABED
            System.out.println(obj1.a); //14 ==> Java selects variables by looking at the data type of the object
            obj1.rest(); //ZZZ ==> Java selects methods by looking at the constructor of the object

            Practice02 obj2 = new Practice03("Woow!");
            System.out.println(obj2.a); //13
            obj2.rest(); //ZZZ

            Practice01 obj3 = new Practice03("Woow!");
            System.out.println(obj3.a); //12
            obj3.rest(); ///ZZZ

            Object obj4 = new Practice03("Woow!");
//            System.out.println(obj4.a);  This will complain because inside Object there is no variable a


            Practice02 obj5=new Practice03("Woow");
            obj5.rest(); //ZZZ
            Practice01 obj6=new Practice02();
            obj6.rest(); //YYY

            System.out.println("=====");


            Practice03 obj7=null; // ??? Don't know the reason?
            obj7.rest(); // You will get run time error, because obj7 didn't created fully


        }
    }

