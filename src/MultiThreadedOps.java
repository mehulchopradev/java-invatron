import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class MultiThreadedOps {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        Callable<Integer> additionCallable = new AdditionCallable(n1, n2);
        Callable<Integer> multiplicationCallable = new MultiplicationCallable(n1, n2);

        ArrayList<Callable<Integer>> callables = new ArrayList<>();
        callables.add(additionCallable);
        callables.add(multiplicationCallable);

        List<Future<Integer>> futures = executorService.invokeAll(callables);

        while (true) {
            long completedFutures = futures.stream().filter(future -> future.isDone()).count();
            if (completedFutures != futures.size()) {
                Thread.sleep(5000);
            } else {
                break;
            }
        }

        futures.forEach(future -> {
            try {
                System.out.println(future.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        });


        executorService.shutdown();
    }
}
