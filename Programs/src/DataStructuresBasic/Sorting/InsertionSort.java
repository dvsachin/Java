package DataStructuresBasic.Sorting;
/**
 * TC= O(n^2) but O(n) in best case and SC=O(1)
 * In-Place and Stable
 * insertion sort is popular/efficient for small size arrays
 * Python is used merge sort but when size small it switches to insertion sort
 * Hybrid Algorithms:
 *  Tim Sort = Merge Sort + Insertion Sort
 *  Intro Sort = Heap Sort + Quick Sort + Insertion Sort
 *
 *  TC = theta(n) already sorted - best case
 *     = theta(n^2) reverse sorted - worst case
 *     = O(n^2) in general
 */
// left is sorted and right is unsorted in array, so start from index=1 and go to left side
// find the correct position of key while going swap elements to the right element and at correct position put key element
public class InsertionSort {
    public static void main (String[] args) {
        int arr[] = new int[]{50,20,40,60,10,30};

        int n = arr.length;
        iSort(arr,n);

        for(int x:arr)
            System.out.print(x+" ");

    }

    static void iSort(int arr[],int n) {

        for(int i=1;i<n;i++){ // 1 to n-1
            int key = arr[i];
            int j=i-1;

            while(j>=0 && arr[j]>key){  // arr[j]>key replace with arr[j]>=key makes work but becomes unstable
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
}
