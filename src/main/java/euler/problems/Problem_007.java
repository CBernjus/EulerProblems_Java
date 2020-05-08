package euler.problems;

import java.util.stream.IntStream;

public class Problem_007 {

    // By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

    // What is the 10001st prime number?

    // Solution: 104743

    static final int INDEX = 10001;

    public static void main(String[] args) {
        System.out.println("Problem 007 - 100001st Prime");

        int result = getPrimeAt(INDEX);

        System.out.println("Solution: " + result);
    }

    public static int getPrimeAt(int index) {
        if(index <= 0) throw new IllegalArgumentException("Index must be positive");

        int i = 3;
        int prime = 2;
        int n = 1;

        while(n != index) {
            if(isPrime(i)) {
                prime = i;
                n++;
            }
            i += 2;
        }

        return prime;
    }

    public static boolean isPrime(int n) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }

}
