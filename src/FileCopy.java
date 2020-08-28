import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopy {
    public static void main(String[] args) {
        String path = "/home/mehul/Documents/training/menu_driven_prog";
        String destination = "/home/mehul/Desktop/menu_driven_copy";


        /* try (
                BufferedReader br = Files.newBufferedReader(Paths.get(path));
                BufferedWriter bw = Files.newBufferedWriter(Paths.get(destination))
                ) {
            br.lines().forEach(line -> {
                try {
                    bw.write(line);
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        } */

        try {
            Files.copy(Paths.get(path), Paths.get(destination));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
