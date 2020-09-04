package date_time;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class Main {


    public static Date convert(LocalDate date) {
        return java.util.Date.from(date.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }

    public static LocalDateTime convert(Date date) {
        return date.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDateTime();
    }

    // 1981/02/30&18:20
    public static long daysBetween(String firstDate, String lastDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd&HH:mm", Locale.ENGLISH);
        LocalDate first = LocalDate.parse(firstDate, formatter);
        LocalDate last = LocalDate.parse(lastDate, formatter);

        return ChronoUnit.DAYS.between(first, last);
    }


    public static void main(String[] args) {
        System.out.println(daysBetween("1981/02/20&18:20", "2020/08/05&11:20"));

        LocalDate now = LocalDate.now();
        Date nowInDate = convert(now);
        System.out.println(nowInDate);

        LocalDateTime nowInDateTime = convert(nowInDate);
        System.out.println(nowInDateTime);
    }
}
