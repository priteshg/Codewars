import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class NthTerm {

    public static void main(String[] args) {
        run(1);
    }

    public static int run(int n) {
        final int x = (10 - n);

        AtomicInteger c = new AtomicInteger();
        IntStream.range(0, n).forEach((i) -> c.set(x * x));

        return c.get();
    }

}
