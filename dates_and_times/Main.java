package dates_and_times;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // (Local Date, Local Time, LocalDateTime, UTC timestamp)

        // LocalDate date = LocalDate.now();
        // System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        //LocalDateTime datetime = LocalDateTime.now();
        //System.out.println(datetime);

        Instant instant = Instant.now(); // UTC time
        System.out.println(instant);

        // Custom format

        // LocalDateTime datetime = LocalDateTime.now();

        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
        // String newDateTime = datetime.format(formatter);
        // System.out.println(newDateTime);


        LocalDate date1 = LocalDate.of(2025, 12, 25);
        LocalDate date2 = LocalDate.of(2025, 11, 1);

        if(date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than " + date2);
        } else {
            System.out.println(date2 + " is earlier than" + date1);
        }



    }
}
