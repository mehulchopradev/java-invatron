import java.time.Duration;
import java.time.LocalTime;

public class PlayTime {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());

        LocalTime next = LocalTime.of(21, 30);
        System.out.println(next);

        Duration duration = Duration.between(time, next);
        System.out.println(duration);
        System.out.println(duration.getSeconds());
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());
    }
}
