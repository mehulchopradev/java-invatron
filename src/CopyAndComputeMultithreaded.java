import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;

public class CopyAndComputeMultithreaded {
    public static void main(String[] args) {
        // copying operation (I/O) - Thread 1 - User defined thread
        /* Thread thread = new Thread(() -> {
            // job of the user defined thread

            String source = "/home/mehul/Documents/functions_notes";
            String destination = "/home/mehul/Desktop/function_copy";
            try {
                Files.copy(Paths.get(source), Paths.get(destination));
                System.out.println("Copying done!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }); */
        /* Thread thread = new Thread(new CopyingThread());
        thread.start(); */ // "schedule" the Thread for running

        CopyingThread thread = new CopyingThread();
        thread.start();

        // compute operation (CPU) - Thread 2 (main thread)
        IntStream.rangeClosed(0, 500).forEach(number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        });
    }
}
