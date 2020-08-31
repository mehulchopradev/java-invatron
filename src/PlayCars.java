public class PlayCars {
    public static void main(String[] args) {
        // single object shared by all the threads below
        CarsList carsList = new CarsList();

        // different threads (family members) that will perform various operations on the above carsList

        // synchronized blocks of code
        // synchronizes on an object
        // every object has a single implicit lock
        // synchronizing on that object tries to get that lock
        // if it gets the lock, it enter the synchronized block with the lock and releases the lock once
        // it comes out of the synchronized block

        Thread me = new Thread(() -> {
            synchronized (carsList) {
                carsList.addNewCar("Audi");
                carsList.addNewCar("Mercedes");
            }
        }, "Me");

        Thread mom = new Thread(() -> {
            String name = Thread.currentThread().getName();

            synchronized (carsList) {
                System.out.println("The number of cars curently are: " + carsList.getNoOfCars() + " as seen by " + name);
                System.out.println("The cars are: " + carsList.getCars() + " as seen by " + name);
            }
        }, "mom");

        Thread wife = new Thread(() -> {
            synchronized (carsList) {
                carsList.addNewCar("Porshe");
            }
        }, "wife");

        Thread son = new Thread(() -> {
            String name = Thread.currentThread().getName();

            synchronized (carsList) {
                System.out.println("The number of cars curently are: " + carsList.getNoOfCars() + " as seen by " + name);
                System.out.println("The cars are: " + carsList.getCars() + " as seen by " + name);
            }
        }, "son");

        Thread sister = new Thread(() -> {
            synchronized (carsList) {
                carsList.addNewCar("i10");
                carsList.addNewCar("i20");
            }
        }, "sister");

        me.start();
        mom.start();
        wife.start();
        son.start();
        sister.start();
    }
}
