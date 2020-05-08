package euler.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem_003 {

    // The prime factors of 13195 are 5, 7, 13 and 29.

    // What is the largest prime factor of the number 600851475143 ?

    // Solution: 6857

    static final long NUMBER = 600851475143L;

    public static void main(String[] args) {
        System.out.println("Problem 003 - Largest Prime Factor");

        long result = getLastElem(primeFactorsOf(NUMBER));

        System.out.println("Solution: " + result);
    }

    private static List<Long> primeFactorsOf(long n) {
        List<Long> factors = new ArrayList<>();

        // n is even
        while(n % 2 == 0) {
            factors.add(2L);
            n /= 2;
        }

        // n is odd
        for(long i = 3; i < Math.sqrt(n); i += 2) {
            while(n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }

        // n is a prime > 2
        if(n > 2) factors.add(n);

        return factors;
    }

    private static <T> T getLastElem(List<T> list) {
        return list.get(list.size() - 1);
    }


}
