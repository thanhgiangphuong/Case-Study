package OOP_learning;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeFormat {
    public static void main(String[] args) {

        String userDate = "2021-02-14"; // create date as string
        LocalDate parseDate = LocalDate.parse(userDate); // parse date to LocalDate object. Local date is immutable and has a pattern of yyyy-MM-dd

        // use date time formatter to create a date pattern  | use MM for digit
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-DD");
        // create a string to assign formatted date
        String date = parseDate.format(formatter);
        System.out.println(date);


    }
}
