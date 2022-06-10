package day19passbyvaluedatetimeclasses;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTime01 {
    public static void main(String[] args) {

        Date date1=new Date();
        System.out.println(date1.getTime());//Returns the number od milliseconds since January 1, 1970

        System.out.println(LocalDate.now());//Returns the current date using the system clock
        System.out.println(LocalDate.now(ZoneId.of("Europe/Istanbul")));

        System.out.println(LocalDate.now().getDayOfWeek());

//        How to get future dates
        System.out.println(LocalDate.now().plusYears(3));
        System.out.println(LocalDate.now().plusDays(200));

//        How to get past dates
        System.out.println(LocalDate.now().minusWeeks(5));

//        How to get curent time
        System.out.println(LocalTime.now());//Will give the current time detailed

        System.out.println(LocalTime.now().getHour() +":"+ LocalTime.now().getMinute());

        System.out.println(LocalTime.now().isAfter(LocalTime.of(22,30,13)));
        System.out.println(LocalTime.now().isBefore(LocalTime.of(22,30,13)));

//        Compare 2 birthdays. Ali:02/13/2005 Veli: 03/01/2007

        if(LocalDate.of(2005,02,13).isBefore(LocalDate.of(2007,03,01)) ){
            System.out.println("Ali is older than Veli");
        }else{
            System.out.println("Veli is older than Ali");
        }

        LocalDate date=LocalDate.now();
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MMMM/yyyy");
        System.out.println(dtf.format(date));
    }
}
