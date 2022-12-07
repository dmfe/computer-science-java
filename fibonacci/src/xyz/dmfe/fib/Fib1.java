package xyz.dmfe.fib;

class Fib1 {
    public static int fib1(int n) {
        return fib1(n - 1) + fib1(n - 2);
    }
}
