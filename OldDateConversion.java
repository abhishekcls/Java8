import java.time.*;
import java.time.temporal.*;
import java.util.*;
//import java.sql.Time;
//import java.sql.TimeStamp;

class OldDateConversion{
    public static void main(String[] args) {
        Instant instant=Instant.now();
        System.out.println(instant);

        Date d=Date.from(instant);
        System.out.println(d);

        Instant ins=d.toInstant();
        System.out.println(ins);
        
        /*TimeStamp time = TimeStamp.from(instant);
        System.out.println(time);

        Instant instant2 = time.toInstant();
        System.out.println(instant2);*/

        /*LocalDate ld=LocalDate.now();
        Date date = Date.from(ld);
        System.out.println(date);

        LocalDate localDate = date.toLocalDate();
        System.out.println(localDate);*/

        /*Time time2 = Time.from(localTime);
        System.out.println(time2);

        LocalTime localTime = time2.toLocalTime();
        System.out.println(localTime);*/
    }
}