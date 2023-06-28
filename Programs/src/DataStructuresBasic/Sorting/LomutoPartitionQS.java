package DataStructuresBasic.Sorting;
// Un-Stable Quick Sort
/**
 * pivot as the last element in array, if pivot as then swap it with last element
 * i is lower elements window then pivot element
 * j is traversing (first to last) the array and compare with pivot element
 * if j element is smaller than pivot,  increment i and swap(arr[i],arr[j])
 * if j element is greater than don't do anything
 * at last, swap(arr[i+1,arr[pivot_index]), so that pivot as middle element
 */
public class LomutoPartitionQS {
    public static void main (String[] args)  {
        int arr[] = new int[]{10,80,30,90,40,50,70};

        int n = arr.length;
        iPartition(arr,0,n-1);

        for(int x: arr)
            System.out.print(x+" ");

    }

    static int iPartition(int arr[], int l, int h)  { // TC = O(n) - "1 traversals", SC = O(1)
        int pivot = arr[h]; // always last not taking as input
        int i = l-1;

        for(int j=l;j<=h-1;j++) {
            if(arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }
}
