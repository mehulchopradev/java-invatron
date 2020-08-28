import java.util.Arrays;
import java.util.stream.Collectors;

public class GlobalAdder {

    public int addMany(Integer... nos) {
        return Arrays.stream(nos).collect(Collectors.summingInt(number -> number));
    }
}
