package DataStructuresBasic.Sorting;

/**
 * In Hoare's partition, picked arr[low] as pivot and in last pivot is not its correct position
 * function will return j which means elements are (low to j) < pivot and (j+1 to high) >= pivot
 * In Lomuto partition pivot ensures its correct position but in Hoare's it's not
 * In Hoare's partition, it takes less number of comparisons than Lomuto partition
 * It works much better than Lomuto on average
 * If all the elements are same than it swap equal elements which becomes unstable
 * and this is main reason Quicksort is unstable
 */
public class HoarePartitionQS {
    public static void main (String[] args) {
        int arr[] = new int[]{5,3,8,4,2,7,1,10};

        int n = arr.length;
        partition(arr,0,n-1);

        for(int x: arr)
            System.out.print(x+" ");

    }

    static int partition(int arr[], int l, int h) { // TC = O(n) - "1 traversals", SC = O(1)
        int pivot=arr[l];
        int i=l-1,j=h+1;
        while(true){
            do{
                i++;
            }while(arr[i]<pivot);

            do{
                j--;
            }while(arr[j]>pivot);

            if(i>=j)return j;

            // swap
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }
}

/**
 * Quick Sort Analyse:
 * Time Complexity -
 *      Partition work => theta(n)
 *      Best case when everytime partition array into two halves  = theta(n * log n) => T(n) = 2T(n/2) + theta(n)
 *      Worst case when partition 1 element and n-1 elements on other side = theta(n^2) + theta(n)  => T(n) = T(n-1) = theta(n)
 *      Average case = O(n * log n)
 *
 * Space Complexity -
 *      Auxiliary space = O(1) - In-place
 *      Recursion call stack
 *          The Worst Case = theta(n) but with tail call elimination it will take theta( log n)
 *          The Best Case = theta( log n)
 */