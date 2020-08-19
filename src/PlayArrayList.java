import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("audi");
        cars.add("mercedes");

        System.out.println(cars);

        cars.add(0, "i10");

        System.out.println(cars);

        cars.remove(0);
        System.out.println(cars);

        cars.add("audi");
        System.out.println(cars);

        cars.remove("audi");
        System.out.println(cars);

        System.out.println(cars.get(1));
        cars.set(0, cars.get(0).toUpperCase());
        System.out.println(cars);


        System.out.println(cars.contains("audi"));
        System.out.println(cars.contains("i10"));

        System.out.println(cars.size());

        /* for(String car: cars) {
            System.out.println(car.toLowerCase());
        } */

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i).toLowerCase());
        }


        List<Integer> pointers = Arrays.asList(10, 4, 5, 7, 9, 3, 4);
        // E - Integer
        pointers.sort(new PointersComparator());
        System.out.println(pointers);

    }
}
