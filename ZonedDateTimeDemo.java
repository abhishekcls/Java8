import java.time.*;
import java.time.temporal.*;
import java.time.format.*;

//https://www.iana.org/time-zones
class ZonedDateTimeDemo{
    public static void main(String[] args) {
        System.out.println(
        ZonedDateTime.of(
        1564, Month.APRIL.getValue(), 23, // year / month / day
        10, 0, 0, 0, // h / mn / s / nanos
        ZoneId.of("Europe/London"))
        ); // prints 1564-04-23T10:00-00:01:15[Europe/London]

        ZonedDateTime currentMeeting =
        ZonedDateTime.of(
        LocalDate.of(2014, Month.MARCH, 12), // LocalDate
        LocalTime.of(9, 30), // LocalTime
        ZoneId.of("Europe/London")
        );

        ZonedDateTime nextMeeting =
        currentMeeting.plus(Period.ofMonths(1));

        ZonedDateTime nextMeetingUS =
        nextMeeting.withZoneSameInstant(ZoneId.of("US/Central"));

        System.out.println(currentMeeting);
        System.out.println(nextMeeting);
        System.out.println(nextMeetingUS);

        System.out.println(
        DateTimeFormatter.ISO_DATE_TIME.format(nextMeetingUS)
        );
        // prints 2014-04-12T03:30:00-05:00[US/Central]
        System.out.println(
        DateTimeFormatter.RFC_1123_DATE_TIME.format(nextMeetingUS)
        );
        // prints Sat, 12 Apr 2014 03:30:00 -0500
    }
}