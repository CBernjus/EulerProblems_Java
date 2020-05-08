package euler.problems;

import java.util.stream.IntStream;

public class Problem_005 {

    // 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

    // What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

    // Solution: 232792560

    public static void main(String[] args) {
        System.out.println("Problem 005 - Smallest Multiple");

        long result = smallestCommonMultipleOf(IntStream.rangeClosed(1, 20).toArray());

        System.out.println("Solution: " + result);
    }


    public static long smallestCommonMultipleOf(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            if(numbers[i] == 0) return 0;
            if(numbers[i] < 0) {
                numbers[i] *= -1;
            }
        }

        long lcm = 1;
        int divisor = 2;

        while(true) {
            int counter = 0;
            boolean divisable = false;

            for(int i = 0; i < numbers.length; i++) {
                if(numbers[i] == 1) counter++;

                if(numbers[i] % divisor == 0) {
                    divisable = true;
                    numbers[i] /= divisor;
                }
            }

            if(divisable) {
                lcm = lcm * divisor;
            } else {
                divisor += 1;
            }

            if(counter == numbers.length) {
                return lcm;
            }
        }
    }

}
