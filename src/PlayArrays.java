public class PlayArrays {

    public static void main(String[] args) {
        // arrays are available at the language level directly

        // I know the elements of an array upfront
        int[] marks = {5, 6, 10, 5, 2}; // array object - 1004
        // arrays are treated as objects in the memory RAM

        // U do not know the elements of an array upfront
        int[] pointers = new int[10]; // array object - 1006

        // array once created cannot have it size expanded / contracted
        // arrays in java are static

        // access the element from an array
        System.out.println(marks[0]);
        System.out.println(marks[4]);

        System.out.println(pointers[0]);

        // array object has only one attribute `length`
        System.out.println(marks.length);
        System.out.println(pointers.length);

        System.out.println("**************** every element on a new line *********************************");
        // print all element from marks array, one per line
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        // modify elements of an array
        marks[1] = 7;

        System.out.println("**************** every element on a new line *********************************");
        // print all element from marks array, one per line
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }
    }
}
