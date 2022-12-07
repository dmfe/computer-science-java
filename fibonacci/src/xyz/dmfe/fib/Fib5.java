package xyz.dmfe.fib;

import java.math.BigInteger;
import java.util.stream.Stream;

public class Fib5 {
    private static BigInteger last;
    private static BigInteger next;

    public static BigInteger fib5(int n) {
        last = BigInteger.valueOf(0);
        next = BigInteger.valueOf(1);

        return Stream.generate(() -> {
            BigInteger oldLast = last;
            last = next;
            next = oldLast.add(next);
            return last;
        }).limit(n).reduce((first, second) -> second).orElse(null);
    }
}
