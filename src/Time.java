import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
//       LocalDate
        System.out.println("LocalDate:\n");
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        LocalDate specificDate = LocalDate.of(2024, 11, 30);
        System.out.println("Last of month date: " + specificDate);

        System.out.println(today.plusDays(5));
        System.out.println(today.minusDays(5));

        int currentYear = today.getYear();
        System.out.println("Current year: " + currentYear);
        System.out.println("Current Month: " + today.getMonth());
        System.out.println("Current day of month: " + today.getDayOfMonth());

        System.out.println("Day of week: " + today.getDayOfWeek());

        System.out.println(today.withYear(2025).withMonth(8));
        System.out.println();

//        LocalTime
        System.out.println("LocalTime:\n");
        LocalTime now = LocalTime.now();
        System.out.println("Now is: " + now);
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int nano = now.getNano();
        System.out.printf("%d:%d:%d.%d%n", hour, minute, second, nano);
        System.out.println();

//        LocalDateTime
        System.out.println("LocalDateTime:\n");
        LocalDateTime nowDateTime = LocalDateTime.now();
        System.out.println("Current date-time: " + nowDateTime);

        LocalDateTime specificDateTime = LocalDateTime.of(2025, 1, 1, 0, 25, 7, 444555666);
        System.out.println("specific-date-time: " + specificDateTime);

        System.out.println("specific-date-time after plus: " + specificDateTime.plusDays(10));
        System.out.println("specific-date-time after minus: " + specificDateTime.minusDays(10));
        System.out.println(specificDateTime.plusDays(31).plusMinutes(35).minusSeconds(7).minusNanos(444555666));

        System.out.println("Year: " + specificDateTime.getYear() + "\nMonth: " + specificDateTime.getMonth().getValue() +
                "\nDate: " + specificDateTime.getDayOfMonth() + "\nHour: " + specificDateTime.getHour() +
                "\nMinute: " + specificDateTime.getMinute() + "\nSecond: " + specificDateTime.getSecond() +
                "\nNano: " + specificDateTime.getNano());
        System.out.println();

        System.out.println("DateTimeFormatter:\n");
        DateTimeFormatter formatPattern = DateTimeFormatter.ofPattern("dd/MM/yy, HH:mm:ss:nn");
        String formattedDateTime = nowDateTime.format(formatPattern);
        System.out.println("Formatted DateTime: " + formattedDateTime);
    }
}
