import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class PlayCarsLocks {
    public static void main(String[] args) {
        // single object shared by all the threads below
        CarsList carsList = new CarsList();

        // Lock carsListLock = new ReentrantLock();

        ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

        // different threads (family members) that will perform various operations on the above carsList

        Thread me = new Thread(() -> {
            try {
                readWriteLock.writeLock().lock();

                carsList.addNewCar("Audi");
                carsList.addNewCar("Mercedes");
            } finally {
                readWriteLock.writeLock().unlock();
            }

        }, "Me");

        Thread mom = new Thread(() -> {
            String name = Thread.currentThread().getName();

            try {
               // carsListLock.lock();
                readWriteLock.readLock().lock();

                System.out.println("The number of cars curently are: " + carsList.getNoOfCars() + " as seen by " + name);
                System.out.println("The cars are: " + carsList.getCars() + " as seen by " + name);
            } finally {
                // carsListLock.unlock();
                readWriteLock.readLock().unlock();
            }
        }, "mom");

        Thread wife = new Thread(() -> {
            try {
                // carsListLock.lock();

                readWriteLock.writeLock().lock();

                carsList.addNewCar("Porshe");
            } finally {
                // carsListLock.unlock();
                readWriteLock.writeLock().unlock();
            }
        }, "wife");

        Thread son = new Thread(() -> {
            String name = Thread.currentThread().getName();

            try {
                // carsListLock.lock();
                readWriteLock.readLock().lock();

                System.out.println("The number of cars curently are: " + carsList.getNoOfCars() + " as seen by " + name);
                System.out.println("The cars are: " + carsList.getCars() + " as seen by " + name);
            } finally {
                // carsListLock.unlock();
                readWriteLock.readLock().unlock();
            }
        }, "son");

        Thread sister = new Thread(() -> {
            try {
                // carsListLock.lock();
                readWriteLock.writeLock().lock();

                carsList.addNewCar("i10");
                carsList.addNewCar("i20");
            } finally {
                // carsListLock.unlock();
                readWriteLock.writeLock().unlock();
            }
        }, "sister");

        me.start();
        mom.start();
        wife.start();
        son.start();
        sister.start();
    }
}
