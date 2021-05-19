import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.*;

class LocalTimeDemo{
    public static void main(String[] args) {
        LocalTime lt1=LocalTime.now();
        LocalTime lt2=LocalTime.of(10,20);

        System.out.println(lt1);
        System.out.println(lt2);

        LocalTime bedtime=LocalTime.of(23,0);
        LocalTime wakeuptime=bedtime.plusHours(8);//7 am

        System.out.println(wakeuptime);
    }
}