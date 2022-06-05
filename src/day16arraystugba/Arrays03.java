package day16arraystugba;

public class Arrays03 {
    public static void main(String[] args) {

/*
Please split the dates and get day, month and the year separately on the console
day
month
year
 */
        String date="25/02/2022";
        String srr[]=date.split("/");

//        1.Way:
        System.out.println("Day: "+srr[0]);
        System.out.println("Month: "+srr[1]);
        System.out.println("Year: "+srr[2]);

//        2.Way
        System.out.println(date.split("/")[0]);
        System.out.println(date.split("/")[1]);
        System.out.println(date.split("/")[2]);



    }
}
