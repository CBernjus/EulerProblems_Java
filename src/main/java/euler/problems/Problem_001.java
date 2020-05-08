package euler.problems;

import java.util.stream.IntStream;

public class Problem_001 {

    // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

    // Find the sum of all the multiples of 3 or 5 below 1000.

    // Solution: 233168

    private static final int MAX = 1000;

    public static void main(String[] args) {
        System.out.println("Problem 001 - Multiples Of 3 And 5");

        int result = multiplesOf3And5(MAX).sum();
        System.out.println("Solution: " + result);
    }

    public static IntStream multiplesOf3And5(int max) {
        return IntStream.range(1, max).filter(x -> (x % 3 == 0) || (x % 5 == 0));
    }

}
