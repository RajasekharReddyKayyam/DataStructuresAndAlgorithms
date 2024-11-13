package Sortings;

import java.util.Arrays;

/**
 * This class demonstrates the implementation of the Bubble Sort algorithm.
 * Bubble Sort is a simple comparison-based sorting algorithm that repeatedly steps 
 * through the list, compares adjacent elements, and swaps them if they are in the 
 * wrong order. The process is repeated until the list is sorted.
 */
public class BubbleSort {

    /**
     * The main method where the Bubble Sort algorithm is executed.
     * It initializes an array, prints the original array, sorts it using the Bubble Sort algorithm, 
     * and then prints the sorted array.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {

        // Bubble Sort is used to find the maximum number in an array 
        // by pushing the highest number to the last position in each iteration.
        int[] a = {10, 35, 26, 33, 19};

        // Print the original array before sorting
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(a));

        // Outer loop for multiple iterations (passes) over the array
        for (int i = 0; i < a.length; i++) { // For each pass
            // Inner loop for comparing adjacent elements and swapping if necessary
            for (int j = 0; j < a.length - 1 - i; j++) { // Compare up to the unsorted part
                // If the current element is greater than the next, swap them
                if (a[j] > a[j + 1]) {
                    // Swap elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        // Print the sorted array after the sorting process
        System.out.println("After Sorting");
        System.out.println(Arrays.toString(a));
    }
}
