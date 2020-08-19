import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class PlayZones {

    public static void main(String[] args) {
        ZonedDateTime currentDateTime = ZonedDateTime.now();
        System.out.println(currentDateTime);

        System.out.println(ZoneId.getAvailableZoneIds());

        ZonedDateTime dubai = ZonedDateTime.now(ZoneId.of("Asia/Dubai"));
        System.out.println(dubai);

        ZonedDateTime hk = ZonedDateTime.now(ZoneId.of("Hongkong"));
        System.out.println(hk);

        System.out.println(dubai.getOffset());
        LocalDateTime localDateTime = hk.toLocalDateTime();
        System.out.println(localDateTime);
    }
}
