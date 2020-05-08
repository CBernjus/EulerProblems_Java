package euler.problems;

public class Problem_009 {

    // A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

    // a^2 + b^2 = c^2
    // For example, 32 + 42 = 9 + 16 = 25 = 52.

    // There exists exactly one Pythagorean triplet for which a + b + c = 1000.

    // Find the product abc.

    // Solution: 31875000

    static final int SUM = 1000;

    public static void main(String[] args) {
        System.out.println("Problem 009 - Special Pythagorean Triplet");

        int result = specialPythagoreanTriple(SUM);

        System.out.println("Solution: " + result);
    }

    public static int specialPythagoreanTriple(int sum) {
        for(int a = 1; a < ((sum / 3) + 1); a++) {
            for(int b = a + 1; b < ((sum / 2) + 1); b++) {
                int c2 = a * a + b * b;
                int c = hasIntSqrt(c2);

                if(c < 0) continue;

                if(a + b + c == sum) {
                    return a * b * c;
                }
            }
        }

        return -1;
    }

    public static int hasIntSqrt(int x) {
        double sqrt = Math.sqrt(x);
        if(Math.floor(sqrt) != sqrt) return -1;
        return (int) sqrt;
    }

}
