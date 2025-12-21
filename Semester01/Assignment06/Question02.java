public class Question02 {
    // Assigned On 15/12/2025 - Tenth Class

    /**
     * @param n The number whose digits is to be calculated.
     * @return Count of digits in a number.
     */
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }

    /**
     * @param a Digit of a number.
     * @param b Power to which the digit has to be raised.
     * @return {@code a} to the power of {@code b}.
     */
    public static int power(int a, int b) {
        return (int) Math.pow(a, b);
    }

    /**
     * @param n The number to checked if armstrong or not.
     * @return boolean to show if number is armstrong or not.
     */
    public static boolean isArmstrong(int n) {
        int original = n;
        int digits = countDigits(n);
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += power(digit, digits);
            n /= 10;
        }
        return sum == original;
    }

    public static void main(String[] args) {
        System.out.println("Armstrong Numbers from 100 to 10000:");
        int count = 0;

        for (int i = 100; i <= 10000; i++) {
            if (isArmstrong(i)) {
                System.out.println(i);
                count++;
            }
        }

        System.out.println("Total armstrong numbers found: " + count);

    }

}
