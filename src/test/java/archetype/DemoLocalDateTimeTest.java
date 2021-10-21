package archetype;

import org.junit.Test;

import java.sql.Time;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DemoLocalDateTimeTest {

    @Test
    public void dateTime() {
        Date date = new Date();
        Time time = new Time(1634579407);
        System.out.println(date);
        Timestamp timestamp = new Timestamp(1634579407);

        LocalDate date1 = LocalDate.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Duration duration = Duration.ofDays(5);
        System.out.println(duration.getSeconds());
        Instant instant = Instant.now();
    }
}
