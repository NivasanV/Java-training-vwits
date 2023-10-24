package date;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DemoDate{
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:SS");


        System.out.println(date);
        System.out.println(time);
        System.out.println(dateTime);

        System.out.println(dateTime.format(formate));
    }
}