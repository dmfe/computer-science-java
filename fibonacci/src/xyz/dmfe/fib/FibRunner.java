package xyz.dmfe.fib;

public class FibRunner {
    public static void main(String[] args) {
        // System.out.println(Fib1.fib1(5)); // Don't run it! StackOverflowError
        System.out.println("1: " + Fib2.fib2(1));
        System.out.println("2: " + Fib2.fib2(2));
        System.out.println("3: " + Fib2.fib2(3));
        System.out.println("4: " + Fib2.fib2(4));
        System.out.println("5: " + Fib2.fib2(5));
        System.out.println("6: " + Fib2.fib2(6));
        System.out.println("7: " + Fib2.fib2(7));
        System.out.println("8: " + Fib2.fib2(8));
        System.out.println("10: " + Fib2.fib2(10));
        System.out.println("20: " + Fib2.fib2(20));
        // System.out.println("100: " + Fib2.fib2(100)); // Too slow
        System.out.println("(Fib3 rec + memo) 100: " + Fib3.fib3(100));
        System.out.println("(Fib3 rec + memo) 200: " + Fib3.fib3(200));
        //
        System.out.println("(Fib4 iter) 100: " + Fib4.fib4(100));
        System.out.println("(Fib4 iter) 200: " + Fib4.fib4(200));
        //
        System.out.println("(Fib5 stream) 100: " + Fib5.fib5(100));
        System.out.println("(Fib5 stream) 200: " + Fib5.fib5(200));
    }
}
