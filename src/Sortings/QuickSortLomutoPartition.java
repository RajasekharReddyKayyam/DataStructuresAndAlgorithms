package Sortings;
/**
 * The QuickSortLomutoPartition class demonstrates the QuickSort algorithm 
 * using the Lomuto partition scheme. It partitions the array around a pivot 
 * and places the pivot in its correct position. The class also prints the 
 * partitioned array and the pivot's index.
 */
public class QuickSortLomutoPartition {
	 /**
     * The main method that demonstrates the Lomuto partitioning of an array.
     * It defines an array of integers, calls the partition function, 
     * and prints the partitioned array and the index of the pivot.
     *
     * @param args The command-line arguments (not used).
     */
    public static void main(String[] args) {
        int a[] = {10, 24, 13, 26, 12, 44, 3};
        
        // Call partition function
        int pivotIndex = lomutoPartition(a, 0, a.length - 1);
        
        // Print partitioned array
        System.out.println("Partitioned array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\nPivot is at index: " + pivotIndex);
    }

    /**
     * The lomutoPartition method partitions an array around a pivot element. 
     * It selects the last element in the array as the pivot, and rearranges 
     * the array such that elements less than the pivot are on the left, 
     * and elements greater than the pivot are on the right.
     * 
     * After the partitioning step, the pivot is placed in its correct position 
     * and the index of the pivot is returned.
     * 
     * @param a The array to be partitioned.
     * @param low The starting index of the subarray to be partitioned.
     * @param high The ending index of the subarray to be partitioned.
     * @return The index of the pivot element after partitioning.
     */
    public static int lomutoPartition(int[] a, int low, int high) {
        int pivot = a[high];  // Take the last element as pivot
        int i = low - 1;  // i will track the boundary of elements less than pivot

        // Loop through all elements from low to high-1
        for (int j = low; j < high; j++) {
            if (a[j] < pivot) {
                // Swap a[i] and a[j], increment i
                i++;
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // Place pivot in its correct position
        int temp = a[i + 1];
        a[i + 1] = a[high];
        a[high] = temp;

        // Return the index where the pivot is placed
        return i + 1;
    }
}
