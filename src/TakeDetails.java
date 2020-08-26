import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class TakeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter language of preference(en/fr): ");
        String languageCode = scanner.nextLine();

        Locale locale = new Locale(languageCode);

        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.studentDetails", locale);

        System.out.println(resourceBundle.getString("namePrompt"));
        String name = scanner.nextLine();

        System.out.println(resourceBundle.getString("agePrompt"));
        int age = scanner.nextInt();

        System.out.println(name);
        System.out.println(age);
    }
}
