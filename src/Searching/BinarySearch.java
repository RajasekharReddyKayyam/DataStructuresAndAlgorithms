package Searching;

public class BinarySearch {

    /**
     * Main method that implements the binary search algorithm.
     * 
     * This program demonstrates the basic functionality of binary search on a sorted array.
     * Given an array of integers, it searches for a target element and prints the index where
     * the element is located in the array.
     * 
     * @param args Command-line arguments (not used in this implementation).
     */
    public static void main(String[] args) {
        
        // A sorted array of integers
        int[] a = {1, 2, 3, 4, 5, 6};
        
        // The lower bound of the search range
        int l = 0;
        
         int count=0;
        
        // The upper bound of the search range (last index of the array)
        int h = a.length - 1;
        
        // The element to search for in the array
        int element = 5;
        recursiveBinarySearch( l, h,element,a);
        
        // Binary search loop
        while (l <= h) {
        	count++;
            
            // Calculate the middle index of the current search range
            int m = (l + h) / 2;
            
            // If the middle element is the target element, print the index and exit
            if  (a[m] == element) {
                System.out.println("Element is at index " + m+"It took "+count+"Iterations") ;
                return; // Exit the program once the element is found
            }
            
            // If the target element is greater than the middle element, search the right half
            else if (a[m] < element) {
                l = m + 1;
            }
            // If the target element is smaller than the middle element, search the left half
            else {
                h = m - 1;
            }
        }
        
        // If the element is not found in the array, print that the element is not present
        System.out.println("Element not found in the array.");
    }
    
    public static void recursiveBinarySearch( int l,int h,int key,int a[]) {
    	int m=(l+h)/2;
    	 if (l > h) {
             System.out.println("Element not found in the array.");
             return;
         }
    	if(a[m]==key) {
    		System.out.println(" Recursive Element found at index"+m);
    		return;
    		
    	}
    	if(a[m]<key) {
    		recursiveBinarySearch(  m+1, h,key, a);
    		
    		
    	}
    	else {
    		recursiveBinarySearch(  m, h-1,key, a);
    		
    	}
    }
}
