import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // LocalDateTime -> Datum! & (Uhr) Zeit
        LocalDateTime currentDateTime = LocalDateTime.now();

        // Add a timespan of 2 weeks
        LocalDateTime futureDateTime = currentDateTime.plusWeeks(2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, 'der' dd.MMMM yyyy, 'um' HH:mm:ss 'Uhr'", Locale.GERMAN);

        System.out.println("Aktuelles Datum und Uhrzeit: " + currentDateTime.format(formatter));

        // Output the new date and time after adding 2 weeks
        System.out.println("Neues Datum und Uhrzeit (nach 2 Wochen): " + futureDateTime.format(formatter));

        // Compare the current date with the future date
        if (currentDateTime.isBefore(futureDateTime)) {
            System.out.println("Das aktuelle Datum liegt vor dem zukünftigen Datum.");
        } else if (currentDateTime.isAfter(futureDateTime)) {
            System.out.println("Das aktuelle Datum liegt nach dem zukünftigen Datum.");
        } else {
            System.out.println("Das aktuelle Datum ist gleich dem zukünftigen Datum.");
        }

        // Calculate the difference in days between the two dates
        LocalDate date1 = currentDateTime.toLocalDate();
        LocalDate date2 = futureDateTime.toLocalDate();
        long daysDifference = ChronoUnit.DAYS.between(date1, date2);

        // Output the result
        System.out.println("Unterschied in Tagen zwischen " + date1 + " und " + date2 + ": " + daysDifference + " Tage");
    }
}
