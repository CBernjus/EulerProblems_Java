package euler.problems;

import java.util.stream.IntStream;

public class Problem_010 {

    // The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

    // Find the sum of all the primes below two million.

    // Solution: 142913828922

    static final int MAX = 2000000;

    public static void main(String[] args) {
        System.out.println("Problem 010 - Summation Of Primes");

        long result = sumOfPrimes(MAX);

        System.out.println("Solution: " + result);
    }

    public static long sumOfPrimes(int max) {
        if(max <= 0) return -1;

        long sum = 2;

        for(int i = 3; i <= max; i += 2) {
            if(isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static boolean isPrime(int n) {
        return IntStream.rangeClosed(2, (int) Math.sqrt(n)).noneMatch(i -> n % i == 0);
    }

}
