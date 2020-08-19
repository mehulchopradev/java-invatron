public class UniversalAdder {

    public static <E extends Number> double adder(E[] elements) {
        Number sum = 0;
        for (E element: elements) {
            sum = sum.doubleValue() + element.doubleValue();
        }

        return sum.doubleValue();
    }

    public static void main(String[] args) {
        Integer[] nos = {5, 4, 6};
        System.out.println(adder(nos));

        Float[] f = {4.5f, 3.4f, 1.6f};
        System.out.println(adder(f));

        String[] cars = {"i10", "i20"};
        // adder(cars); // This will not work as the generic method expects E to be anything which is a Number
    }
}
