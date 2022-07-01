package day26exception;

public class EQ02 {
    public static void main(String[] args) {


        String arr[]={"Ali", "Can", "Veli", "Han"};

        getAnElementFromAnArray(arr,2); //Veli
        getAnElementFromAnArray(arr,0); //Ali
        getAnElementFromAnArray(arr,4); //ArrayIndexOutOfBoundsException ==> Index 4 out of bounds for (index 4 doesn't exist)

    }
    public static void getAnElementFromAnArray(String arr[],int idx){
        try {
            System.out.println(arr[idx]);
        } catch(ArrayIndexOutOfBoundsException e){
            System.err.println("An error occureed in array operation ==> "+e.getMessage());
        }
    }
}
