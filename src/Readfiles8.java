import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Readfiles8 {
    public static void main(String[] args) {
        String path = "/home/mehul/Documents/training/menu_driven_prog";

        /* try (Stream<String> lines = Files.lines(Paths.get(path))) {
            lines.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        } */

        try (BufferedReader br = Files.newBufferedReader(Paths.get(path))) {
            br.lines()
                    .filter(line -> line.contains("*"))
                    .map(line -> line.toUpperCase())
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
