public class AmicableInARange {
    /**
     * This program can return amicable pairs for the specified range.
     * @param args
     */
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Enter start of range: ");
        int start = scanner.nextInt();

        System.out.print("Enter end of range: ");
        int end = scanner.nextInt();

        if (start < 1 || end < 1 || start > end) {
            System.out.println("Please enter positive numbers where start <= end.");
            scanner.close();
        }

        boolean found = false;

        for (int a = start; a <= end; a++) {
            int b = sumOfProperDivisors(a);

            /* Amicable numbers are two different positive 
            * integers where each number equals the sum of the 
            * proper divisors (positive divisors excluding the number itself) 
            * of the other.
            */

            if (b > a && b <= end && sumOfProperDivisors(b) == a) {
                System.out.println(a + " & " + b);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No amicable pairs found in the given range.");
        }

        scanner.close();
    }

    // Returns the sum of all proper divisors of n (excluding n itself).
    private static int sumOfProperDivisors(int n) {
        if (n <= 1) {
            return 0;
        }

        int sum = 1; // 1 is a proper divisor for any n > 1
        int limit = (int) Math.sqrt(n);

        for (int i = 2; i <= limit; i++) {
            if (n % i == 0) {
                sum += i;
                /* We need to find pairs.
                * 36 square root is taken (=6)
                * Therefore, we need divisor greater
                * and less than 6, not just till 6.
                */
                int pair = n / i;
                if (pair != i) {
                    sum += pair;
                }
            }
        }

        return sum;
    }
}
