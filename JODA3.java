import java.time.*;
public class JODA3 {
    public static void main(String[] args) {
        Instant start=Instant.now();

        for(int i=1;i<=99999999;i++){

        }

        Instant end=Instant.now();

        System.out.println(start);
        System.out.println(end);

        Duration elapsed=Duration.between(start, end);
        long millis=elapsed.toMillis();
        System.out.println(millis);

        long nanos=elapsed.toNanos();
        System.out.println(nanos);
    }
}
