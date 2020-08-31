import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class CopyAndComputeExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(() -> {
            String source = "/home/mehul/Documents/functions_notes";
            String destination = "/home/mehul/Desktop/function_copy";
            try {
                Files.copy(Paths.get(source), Paths.get(destination));
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("Copying done!");
        });

        // compute operation (CPU) - Thread 2
        IntStream.rangeClosed(0, 500).forEach(number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        });

        executorService.shutdown();
    }
}
