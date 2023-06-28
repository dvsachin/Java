package DataStructuresBasic.Sorting;

/**
 * Counting Sort is linear sorting algorithm when our input is in small range
 * It takes theta(n+k) time to sort n elements in range from 0 to k-1
 * It takes theta(n+k) space
 * It never compare elements with each other rather it count occurrences (Not a comparison based algorithm)
 * Counting Sort is useful only when K is linear in terms of N e.g: K = N | 3N | N/2
 * But when K becomes N * log N or quadratic than it is no use and
 * In this case Radix Sort is better takes linear times when input is 0-N^3
 * It is a stable sort algorithm
 * Used as a subroutine
 */
public class CountingSort {
    public static void main (String[] args)
    {
        int arr[] = { 1,4,4,1,0,1 };
        int n = arr.length; int k=5;
        countSortNaive(arr, n, k);
        countSortEfficient(arr, n, k);

        for (int i = 0; i < n; i++)
            System.out.print( arr[i] + " ");

    }

    /**
     * countSortNaive() Cannot be used as a general purpose algorithm for sorting objects with multiple members,
     * like sorting an array of students by marks
     */
    static void countSortNaive(int arr[], int n, int k) { // TC = theta(n+K)
        int[] count = new int[k];
        for(int i=0;i<k;i++)
            count[i]=0;

        for(int i=0;i<n;i++)
            count[arr[i]]++;


        int index=0;
        for(int i=0;i<k;i++) {
            for(int j=0;j<count[i];j++) {
                arr[index] = i;
                index++;
            }
        }
    }

    /**
     * General Purpose implementation countSortEfficient() works well even to sort objects also
     */
    static void countSortEfficient(int arr[], int n, int k) { //
        int[] count=new int[k];
        for(int i=0;i<k;i++)
            count[i]=0;
        for(int i=0;i<n;i++)
            count[arr[i]]++;

        for(int i=1;i<k;i++)
            count[i]=count[i-1]+count[i];

        int[] output=new int[n];
        for(int i=n-1;i>=0;i--){
            output[count[arr[i]]-1]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++)
            arr[i]=output[i];
    }
}
