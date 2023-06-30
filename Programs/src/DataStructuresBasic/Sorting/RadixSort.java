package DataStructuresBasic.Sorting;

/** Algorithm
 * 1. find the largest element in the array
 * 2. Call the counting sort with the number of times or number of digits in maximum number have
 * 3. Counting Sort:
 *      1. Creates an output Array equal to n (given array size)
 *      2. Creates a Count Array equal to base (10)
 *      3. get the count index ((arr[i] / exp) % 10)
 *          and increment the count array index value
 *
 *      4. count the cumulative sum of a count array
 *          to find out the element with last digit at index i should be put at position in cumulative count value of index i
 *          like the element with last digit 9 in count array should be put at position 6 in cumulative count array
 *          position means index = position - 1
 *
 *      5. Now put the value of arr[i] in the output array using cumulative count array as
 *          output[count[(arr[i] / exp) % 10] - 1] = arr[i]
 *      6. Now the decrement the count array index value
 *          count[(arr[i] / exp) % 10]--
 *
 *      7. Now copy all the elements of output array to input 'arr' array
 *
 * 4. second and so on countingSort calls till exp:
 *      mx / exp > 0 is true
 */


/**
 * TC = Theta(d * (n + b))
 *  d = number of digits in a max element
 *  b is the base
 *  but d and b is inversely proportional if b is increased then d (loop will run less number of times) will be decreased
 *  but extra space count array is increased with b (base)
 *
 * SC = Theta(n + b)
 */


public class RadixSort {
    public static void main (String[] args) {
        int arr[] = { 319,212,6,8,100,50 };
        int n = arr.length;
        radixsort(arr, n);

        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");

    }

    static void countingSort(int arr[], int n, int exp) {
        int[] output=new int[n];
        int[] count=new int[10];

        for (int i = 0; i < n; i++)
            count[(arr[i] / exp) % 10]++;

        for (int i = 1; i < 10; i++)
            count[i] += count[i - 1];

        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        for (int i = 0; i < n; i++)
            arr[i] = output[i];
    }

    public static void radixsort(int arr[], int n) {
        int mx = arr[0];
        for (int i = 1; i < n; i++) // finding the mx element
            if (arr[i] > mx)
                mx = arr[i];

        for (int exp = 1; mx / exp > 0; exp *= 10) // Number of times or digits of mx number has
            countingSort(arr, n, exp); // with increasing exp value 1*10, 10*10, 100*10 and so on...
    }
}
