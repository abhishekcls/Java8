import java.util.Date;
import java.time.*;//JODA
import java.time.temporal.*;
public class JODA {
    public static void main(String[] args) {
        Date d=new Date();
        System.out.println(d);

        LocalDate ld=LocalDate.now();
        System.out.println(ld);

        LocalTime lt=LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt=LocalDateTime.now();
        System.out.println(ldt);

        LocalDate ld1=LocalDate.now();
        //LocalDate ld2=LocalDate.of(1564,4,23);
        LocalDate ld2=LocalDate.of(1991,Month.APRIL,23);

        LocalDate nextSunday=ld1.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println("nextSunday "+nextSunday);

        System.out.println(ld1);
        System.out.println(ld2);


        LocalTime lt1=LocalTime.now();
        LocalTime lt2=LocalTime.of(10,20);

        System.out.println(lt1);
        System.out.println(lt2);

        LocalTime bedtime=LocalTime.of(23,0);
        LocalTime wakeuptime=bedtime.plusHours(8);
        
        System.out.println(wakeuptime);
    }
}
