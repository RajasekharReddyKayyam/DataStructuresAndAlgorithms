package Sortings;

import java.util.Arrays;

/**
 * The {@code MergeSort} class demonstrates how to merge two pre-sorted arrays into a single sorted array.
 * This implementation manually merges two sorted arrays using a two-pointer technique.
 * 
 * <p>The arrays {@code a} and {@code b} are merged into the array {@code c}, which holds the final result.
 * The merge operation involves comparing the elements of the two arrays and placing them into the 
 * resulting array in sorted order.
 * </p>
 */
public class MergeSort {

    /**
     * The main method that drives the merging process of two sorted arrays.
     * 
     * <p>It initializes two sorted arrays {@code a} and {@code b}, and merges them into a new array {@code c}
     * using a two-pointer approach. The final merged array is then printed to the console.</p>
     * 
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Initialize two sorted arrays 'a' and 'b'
        int a[] = {2, 5, 12, 35, 46};
        int b[] = {3, 4, 13, 34, 49};
        
        // Create a new array 'c' to hold the merged result
        // Its length is the sum of the lengths of arrays 'a' and 'b'
        int c[] = new int[a.length + b.length];
        
        // Initialize indices for arrays 'a', 'b', and 'c'
        int i = 0; // Index for array 'a'
        int j = 0; // Index for array 'b'
        int k = 0; // Index for array 'c'
        
        // Merge the arrays until we reach the end of one of the arrays
        while (i < a.length && j < b.length) {
            // Compare elements of 'a' and 'b', and place the smaller one into 'c'
            if (a[i] < b[j]) {
                c[k] = a[i]; // Place element from 'a' into 'c'
                i++;          // Move to the next element in 'a'
            } else {
                c[k] = b[j];  // Place element from 'b' into 'c'
                j++;          // Move to the next element in 'b'
            }
            k++; // Move to the next index in the merged array 'c'
        }
        
        // If there are remaining elements in array 'a', add them to 'c'
        while (i < a.length) {
            c[k] = a[i]; // Place remaining element from 'a' into 'c'
            i++;         // Move to the next element in 'a'
            k++;         // Move to the next index in 'c'
        }
        
        // If there are remaining elements in array 'b', add them to 'c'
        while (j < b.length) {
            c[k] = b[j]; // Place remaining element from 'b' into 'c'
            j++;         // Move to the next element in 'b'
            k++;         // Move to the next index in 'c'
        }
        
        // Print the merged array 'c' as a string
        System.out.println(Arrays.toString(c));
    }
}
