import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PlayCarsEXecutor {
    public static void main(String[] args) {
        // single object shared by all the threads below
        CarsList carsList = new CarsList();

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        Callable<Void> me = () -> {
            synchronized (carsList) {
                carsList.addNewCar("Audi");
                carsList.addNewCar("Mercedes");
            }
            return null;
        };

        Callable<Void> mom = () -> {
            String name = Thread.currentThread().getName();

            synchronized (carsList) {
                System.out.println("The number of cars curently are: " + carsList.getNoOfCars() + " as seen by " + name);
                System.out.println("The cars are: " + carsList.getCars() + " as seen by " + name);
            }
            return null;
        };

        Callable<Void> wife = () -> {
            synchronized (carsList) {
                carsList.addNewCar("Porshe");
            }
            return null;
        };

        Callable<Void> son = () -> {
            String name = Thread.currentThread().getName();

            synchronized (carsList) {
                System.out.println("The number of cars curently are: " + carsList.getNoOfCars() + " as seen by " + name);
                System.out.println("The cars are: " + carsList.getCars() + " as seen by " + name);
            }

            return null;
        };

        Callable<Void> sister = () -> {
            synchronized (carsList) {
                carsList.addNewCar("i10");
                carsList.addNewCar("i20");
            }

            return null;
        };

        List<Callable<Void>> callables = new ArrayList<>();
        callables.add(me);
        callables.add(mom);
        callables.add(wife);
        callables.add(son);
        callables.add(sister);

        try {
            executorService.invokeAll(callables);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
