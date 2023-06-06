package programming_Language.ArraysAndString;

public class MaxElementInArray {
    // Method to find maximum in arr[]
    static int largest(int []arr) {
        int i;

        // Initialize maximum element
        int max = arr[0];

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++)
            if (arr[i] > max)
                max = arr[i];

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {10, 324, 45, 90, 9808, 33, 123, 432};
        System.out.println("Largest in given array is " + largest(arr));
    }
}
