import java.util.concurrent.Callable;

public class MultiplicationCallable implements Callable<Integer> {

    private int n1;
    private int n2;

    public MultiplicationCallable(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    @Override
    public Integer call() throws Exception {
        int ans = this.n1 * this.n2;
        return ans;
    }
}
