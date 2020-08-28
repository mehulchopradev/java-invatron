import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReadFbLogs {
    public static void main(String[] args) throws IOException {
        String path = "/home/mehul/Documents/data-analysis-data/data-analysis-data/facebook_logs/facebook_login_logout_logs";

        Map<String, List<String[]>> m1 = Files.lines(Paths.get(path))
                .map(line -> {
                    String[] tokens = line.split(",");
                    String[] pass = {tokens[0], tokens[3]};
                    return pass;
                })
                .filter(pass -> pass[1].equals("out"))
                .collect(Collectors.groupingBy(pass -> pass[0]));

        m1.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value.size());
        });
    }
}
