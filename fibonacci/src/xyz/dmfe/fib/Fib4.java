package xyz.dmfe.fib;

import java.math.BigInteger;

public class Fib4 {
    public static BigInteger fib4(int n) {
        BigInteger last = BigInteger.valueOf(0);
        BigInteger next = BigInteger.valueOf(1);
        for (int i = 0; i < n; i++) {
            BigInteger oldLast = last;
            last = next;
            next = oldLast.add(next);
        }

        return last;
    }
}
