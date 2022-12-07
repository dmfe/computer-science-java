package xyz.dmfe.fib;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Fib3 {
    private static Map<Integer, BigInteger> memo = new HashMap<>();

    public static BigInteger fib3(int n) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n < 2) return BigInteger.valueOf(n);
        memo.put(n, fib3(n - 1).add(fib3(n - 2)));
        return memo.get(n);
    }
}
