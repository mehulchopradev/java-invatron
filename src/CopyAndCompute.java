import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.IntStream;

// Process
public class CopyAndCompute {

    // a lightweight channel - thread
    // main thread

    // a single process can have multiple threads running
    public static void main(String[] args) throws IOException {
        // single threaded way
        // copying operation (I/O) - Thread 1
        String source = "/home/mehul/Documents/functions_notes";
        String destination = "/home/mehul/Desktop/function_copy";
        Files.copy(Paths.get(source), Paths.get(destination));
        System.out.println("Copying done!");

        // compute operation (CPU) - Thread 2
        IntStream.rangeClosed(0, 500).forEach(number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        });
    }
}
