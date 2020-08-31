import java.util.stream.IntStream;

public class EvenOddMultithreaded {
    public static void main(String[] args) throws InterruptedException {

        System.out.println(Thread.currentThread().getName() + " scheduled ");

        // compute (CPU)
        Thread even = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " scheduled ");
            IntStream.rangeClosed(0, 200).forEach(number -> {
                if (number % 2 == 0) {
                    System.out.println(number);
                }
            });
        }, "Even Thread");

        // compute (CPU)
        Thread odd = new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + " scheduled ");
            IntStream.rangeClosed(1, 200).forEach(number -> {
                if (number % 2 != 0) {
                    System.out.println(number);
                }
            });
        }, "Odd Thread");

        even.start();
        odd.start();


        even.join();
        odd.join();
        // makes the main thread wait for both the threads to finish their execution

        // shud execute only once the above two threads are finished with their respective executions
        System.out.println("Counting is done!");
    }
}
