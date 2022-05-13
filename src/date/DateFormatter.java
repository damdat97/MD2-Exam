package date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    private final static String PATTERN_DATE = "yyyy-MM-dd";

    public static String formatDate(LocalDate date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN_DATE);
        return formatter.format(date);
    }

    public static LocalDate parseDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN_DATE);
        return LocalDate.parse(date, formatter);
    }
}
