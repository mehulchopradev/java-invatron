import java.util.Comparator;

public class PointersComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        // ascending order
        // return -1 if o1 < o2
        // return 0 if o1 == o2
        // return +1 if o1 > o2

        // descending order
        // return -1 if o1 > o2
        // return 0 if o1 == o2
        // return +1 if o1 < o2

        return o2.compareTo(o1);
    }
}
