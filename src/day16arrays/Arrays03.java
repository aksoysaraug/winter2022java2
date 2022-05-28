package day16arrays;

public class Arrays03 {
    public static void main(String[] args) {


//    Please split the dates and get day,month and the year separately on the console

        String date = "23/02/2022";

//        1.Way
        String arr[] = date.split("/");
        for (String w : arr) {
            System.out.println(w);}


//        2.Way
            System.out.println("Day: " + arr[0]);
            System.out.println("Month: " + arr[1]);
            System.out.println("Year: " + arr[2]);

        }

    }
