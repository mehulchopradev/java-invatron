import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PlayDate {

    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now); // YYYY-MM-DD

        LocalDate birth = LocalDate.of(1986, Month.NOVEMBER, 25);
        System.out.println(birth); // YYYY-MM-DD

        System.out.println(birth.getYear());
        System.out.println(birth.getMonth());
        System.out.println(birth.getMonth().getValue());
        System.out.println(birth.getDayOfMonth());

        LocalDate next = LocalDate.of(now.getYear(), 11, 25);
        System.out.println(next); // YYYY-MM-DD
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(next.format(dtf));

        LocalDate next10Days = now.plusDays(10);
        System.out.println(next10Days);

        Period period = Period.between(now, next);
        System.out.println(period);
        System.out.println(period.getMonths() + " months");
        System.out.println(period.getDays() + " days");
    }
}
