import com.MyArray;

public class UseMyArray {

    public static void main(String[] args) {
        Integer[] nos = {5, 6, 7, 2, 4, 8, 9};
        MyArray<Integer> myArray = new MyArray<>(nos);

        // if MyArray stores an array of Integer types
        // All the methods get(), set() should behave as if they were written for the Integer type

        // first element from the array
        int element = myArray.get(1);
        System.out.println(element);

        myArray.set(2, 10);
        myArray.printAll();

        Float[] fs = {5.4f, 6.2f};
        MyArray<Float> myArray3 = new MyArray<>(fs);

        // myArray.set(1, "Good morning"); // this will not work

        /* String[] cars = {"audi", "mercedes"};
        MyArray<String> myArray1 = new MyArray<>(cars);

        // if MyArray stores an array of String types
        // All the methods get(), set() should behave as if they were written for the String type

        myArray1.set(1, "Audi");
        // myArray1.set(2, 10); // this will not work

        myArray1.printAll();

        String car = myArray1.get(2);
        System.out.println(car);

        // generics can be dropped where java reverts back to Object
        MyArray myArray2 = new MyArray(cars);
        myArray2.get(3);

        myArray2.set(1, 6);
        myArray2.set(2, "mehul"); */
    }
}
