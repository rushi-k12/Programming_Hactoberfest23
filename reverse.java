public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.println("Original Array:");
        printArray(numbers);
        
        // Reverse the array
        reverseArray(numbers);
        
        System.out.println("\nReversed Array:");
        printArray(numbers);
    }
    
    // Function to reverse the given array
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            // Swap elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            // Move pointers towards the center
            start++;
            end--;
        }
    }
