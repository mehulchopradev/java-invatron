import java.util.ArrayList;

public class CarsList {

    private ArrayList<String> cars;

    public CarsList() {
        this.cars = new ArrayList<>();
    }

    public void addNewCar(String newCar) {
        this.cars.add(newCar);
    }

    public int getNoOfCars() {
        return this.cars.size();
    }

    public String getCars() {
        return String.join("|", this.cars);
    }
}
