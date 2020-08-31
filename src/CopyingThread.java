import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/* public class CopyingThread implements Runnable {
    @Override
    public void run() {
        // job of the user defined thread

        String source = "/home/mehul/Documents/functions_notes";
        String destination = "/home/mehul/Desktop/function_copy";
        try {
            Files.copy(Paths.get(source), Paths.get(destination));
            System.out.println("Copying done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
} */

public class CopyingThread extends Thread {
    @Override
    public void run() {
        // job of the user defined thread

        String source = "/home/mehul/Documents/functions_notes";
        String destination = "/home/mehul/Desktop/function_copy";
        try {
            Files.copy(Paths.get(source), Paths.get(destination));
            System.out.println("Copying done!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
