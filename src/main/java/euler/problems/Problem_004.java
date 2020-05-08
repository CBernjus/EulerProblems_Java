package euler.problems;

import java.util.Objects;

public class Problem_004 {

    // A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

    // Find the largest palindrome made from the product of two 3-digit numbers.

    // Solution: 906609

    static final int DIGITS = 3;

    public static void main(String[] args) {
        System.out.println("Problem 004 - Largest Palindrome Product");

        long result = getLargestPalindromeProduct(DIGITS);

        System.out.println("Solution: " + result);
    }

    public static long getLargestPalindromeProduct(int digits) {
        long upperBound = (long) Math.pow(10, digits) - 1;
        long lowerBound = (long) Math.pow(10, digits - 1);

        long factor1 = 0;
        long factor2 = 0;

        long max = 0;

        for(long i = upperBound; i >= lowerBound; i--) {
            if(max > i * upperBound) break;
            for(long j = upperBound; j >= i; j--) {
                long product = i * j;
                if(product > max && isPalindrome(product)) {
                    max = product;
                    factor1 = i;
                    factor2 = j;
                }
            }
        }

        System.out.println(factor1);
        System.out.println(factor2);

        return max;
    }

    public static boolean isPalindrome(long n) {
        String str = Long.toString(n);
        String reversed = new StringBuilder(str).reverse().toString();
        return Objects.equals(str, reversed);
    }

}
