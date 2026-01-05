package Semester01.Assignment07;

import java.util.Scanner;

public class Question05 {
    // To be assigned.
    public static int findSecondLargest(int[] arr) {
        // int largest = arr[0];
        // for (int i = 1; i < arr.length; i++) {
        //     if (arr[i] > largest) {
        //         largest = arr[i];
        //     }
        // }
        // int lastDifference = largest - arr[0], difference = 0, secondLargest = 0;

        // for (int i = 1; i < arr.length - 1; i++) {
        //     difference = largest - arr[i];
        //     if (difference < lastDifference) {
        //         lastDifference = difference;
        //         secondLargest = arr[i];
        //     }
        // }
        // return secondLargest;

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int[] arr = new int[input.nextInt()];
        System.out.print("Enter the elements of array one by one: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.printf("The second largest element is: %d%n", findSecondLargest(arr));
        input.close();
    }
}
