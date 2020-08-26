import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Locale;
import java.util.stream.Stream;

public class PlayLocale {
    public static void main(String[] args) {
        Locale currentLocale = Locale.getDefault();
        System.out.println(currentLocale);

        /* Arrays.stream(Locale.getAvailableLocales())
                .forEach(locale -> {
                    System.out.println(locale.getDisplayLanguage() + ", " + locale.getDisplayCountry());
                }); */

        System.out.println(Arrays.stream(Locale.getAvailableLocales())
                .count());

        Locale canada = new Locale("en", "CA");
        System.out.println(canada);

        Locale canada2 = Locale.CANADA_FRENCH;
        System.out.println(canada2);

        Locale.setDefault(canada); // sets the locale for the current instance of the JVM

        // formatting currency
        // what are the locales supported by the JVM for currency formatting
        System.out.println(Arrays.stream(NumberFormat.getAvailableLocales())
                .count());

        double amount = 56000;

        /* NumberFormat canadianFormat = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        System.out.println(canadianFormat.format(amount));

        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(currentLocale);
        System.out.println(indiaFormat.format(amount)); */

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        System.out.println(numberFormat.format(amount));

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", canada2);
        System.out.println(localDateTime.format(dateTimeFormatter));

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", Locale.CHINA);
        System.out.println(localDateTime.format(dateTimeFormatter2));

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", new Locale("hi", "IN"));
        System.out.println(localDateTime.format(dateTimeFormatter3));
    }
}
