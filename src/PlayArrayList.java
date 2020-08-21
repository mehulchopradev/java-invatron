import java.util.*;

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

        // local class
        class PointersComparator1 implements Comparator<Integer> {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        }


        // List<Integer> pointers = Arrays.asList(10, 4, 5, 7, 9, 3, 4);
        List<Integer> pointers = new ArrayList<>();
        pointers.add(10);
        pointers.add(4);
        pointers.add(5);
        pointers.add(7);
        pointers.add(9);
        pointers.add(3);
        pointers.add(4);

        // E - Integer
        // pointers.sort(new PointersComparator1());

        // annoymous inner class
        pointers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        System.out.println(pointers);


        // from the pointers list remove all even elements
        Iterator<Integer> iterator = pointers.iterator();
        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element % 2 == 0) {
                iterator.remove();
            }
        }

        System.out.println(pointers);
    }
}
