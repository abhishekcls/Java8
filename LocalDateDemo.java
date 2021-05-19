import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;

class LocalDateDemo{
    public static void main(String[] args) {
        LocalDate ld1=LocalDate.now();
        //LocalDate ld2=LocalDate.of(1564,4,23);
        LocalDate ld2=LocalDate.of(1991,Month.APRIL,23);

        LocalDate nextSunday=ld1.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
        System.out.println(nextSunday);

        System.out.println(ld1);
        System.out.println(ld2);

        Period p=ld2.until(ld1);//like Duration of Instant
        System.out.println(p.getYears());
        System.out.println(p.getMonths());//remaining months after the last year

        //System.out.println(p.get(ChronoUnit.YEARS));
        //System.out.println(p.get(ChronoUnit.MONTHS));//remaining months after the last year

        long days=ld2.until(ld1,ChronoUnit.DAYS);
        System.out.println(days);

        LocalDate ld=LocalDate.of(2001, 7, 19);
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("d/M/y");
        System.out.println(dtf.format(ld));
    }
}