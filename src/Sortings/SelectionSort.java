package Sortings;

import java.util.Arrays;

/**
 * This class implements the Selection Sort algorithm.
 * Selection Sort is an in-place comparison-based sorting algorithm that works by repeatedly 
 * selecting the minimum element from the unsorted part of the array and swapping it with 
 * the first unsorted element.
 */
public class SelectionSort {

    /**
     * The main method where the Selection Sort algorithm is executed.
     * It initializes an array, prints the original array, sorts it using the selection sort algorithm, 
     * and then prints the sorted array.
     *
     * @param args Command line arguments (not used in this example).
     */
    public static void main(String[] args) {
        // Initialize the array to be sorted
        int a[] = {10, 34, 22, 76, 12};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(a));

        // Selection sort: outer loop to traverse through the entire array
        for (int i = 0; i < a.length; i++) {
            // Assume the current element is the minimum
            int minindex = i;

            // Inner loop to find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < a.length; j++) {
                // If a smaller element is found, update the index of the minimum element
                if (a[minindex] > a[j]) {
                    minindex = j;
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = a[i];
            a[i] = a[minindex];
            a[minindex] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(a));
    }
}
