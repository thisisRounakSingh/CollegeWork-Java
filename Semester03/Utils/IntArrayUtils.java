package Semester03.Utils;

import java.util.Scanner;

/**
 * Stateless helpers for one-dimensional {@code int} arrays.
 *
 * <p>Stateless means the class holds no fields and remembers nothing between
 * calls: every method works only from its arguments and returns a result or
 * acts on the passed array. Callers use the class name directly, with no
 * object to create (see the private constructor below).
 *
 * <p>All methods fail fast: bad arguments throw immediately instead of
 * printing and returning {@code null}, so the reported line points at the
 * real mistake.
 */
public final class IntArrayUtils {

    /**
     * Blocks instantiation; this class offers only static helpers.
     */
    private IntArrayUtils() {
    }

    /**
     * Reads {@code n} integers from the given scanner into a new array.
     *
     * @param scanner source of input; must not be {@code null}
     * @param n number of values to read; must be positive
     * @return a new array of length {@code n} holding the read values
     * @throws NullPointerException if {@code scanner} is {@code null}
     * @throws IllegalArgumentException if {@code n} is not positive
     */
    public static int[] read(Scanner scanner, int n) {
        if (scanner == null) {
            throw new NullPointerException("`scanner` must not be null.");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("`n` cannot be less than or equal to zero. got: " + n);
        }
        int[] array = new int[n];
        System.out.print("Enter " + n + " integers separated by spaces: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    /**
     * Prints the array on one line in the form {@code [a,b,c]}.
     *
     * @param array the array to print; must not be {@code null}
     * @throws NullPointerException if {@code array} is {@code null}
     */
    public static void print(int[] array) {
        if (array == null)
            throw new NullPointerException("`array` cannot be of type null.");

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.printf(i == array.length - 1 ? "%d" : "%d,", array[i]);
        }
        System.out.print("]\n");
    }

    /**
     * Returns an independent copy of the given array.
     *
     * @param array the source; must not be {@code null}
     * @return a new array with the same values in the same order
     * @throws NullPointerException if {@code array} is {@code null}
     */
    public static int[] copy(int[] array) {
        if (array == null)
            throw new NullPointerException("`array` cannot be of type null.");

        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    /**
     * Builds a new array of length {@code n} filled with random values in the
     * inclusive range {@code [min, max]}.
     *
     * @param n length of the new array; must be positive
     * @param min lower bound of the range; must not exceed {@code max}
     * @param max upper bound of the range (inclusive)
     * @return a new array of random values; {@code min == max} yields a constant array
     * @throws IllegalArgumentException if {@code min > max} or {@code n} is not positive
     */
    public static int[] random(int n, int min, int max) {
        if (min > max) {
            throw new IllegalArgumentException("`min` cannot be greater than `max`.");
        }

        if (n <= 0) {
            throw new IllegalArgumentException("`n` cannot be less than or equal to zero.");
        }
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = min + (int) (Math.random() * ((max - min) + 1));
        }
        return array;
    }

    /**
     * Exchanges the values at positions {@code i} and {@code j} in place.
     *
     * @param array the array to modify; must not be {@code null}
     * @param i first index; must be within {@code [0, array.length)}
     * @param j second index; must be within {@code [0, array.length)}
     * @throws NullPointerException if {@code array} is {@code null}
     * @throws IllegalArgumentException if either index is negative or past the end
     */
    public static void swap(int[] array, int i, int j) {
        if (array == null)
            throw new NullPointerException("`array` cannot be null.");

        if (i < 0 || j < 0)
            throw new IllegalArgumentException("`i` and `j` cannot be less than zero.");

        if (i >= array.length || j >= array.length)
            throw new IllegalArgumentException("`i` or `j` is past or equal to the length of the array.");

        int temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }

    /**
     * Checks whether the array is sorted in the requested direction.
     *
     * <p>Ascending means every adjacent pair satisfies the left value is less
     * than or equal to the right one; descending is the mirror. Empty and
     * single-element arrays count as sorted.
     *
     * @param array the array to check; must not be {@code null}
     * @param ascending {@code true} to check ascending, {@code false} for descending
     * @return {@code true} if no adjacent pair violates the direction
     * @throws NullPointerException if {@code array} is {@code null}
     */
    public static boolean isSorted(int[] array, boolean ascending) {
        if (array == null)
            throw new NullPointerException("`array` cannot be of type null.");

        boolean itIs = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (ascending ? array[i] < array[i + 1] : array[i] > array[i + 1])
                continue;
            else {
                itIs = false;
                break;
            }

        }
        return itIs;
    }
}
