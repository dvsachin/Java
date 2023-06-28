package DataStructuresBasic.Sorting;
// Stable Quick Sort
public class NaivePartitionQS {
    public static void main (String[] args) {
        int arr[] = new int[]{5,13,6,9,12,11,8};

        int n = arr.length;
        partition(arr,0,n-1,n-1);

        for(int x: arr)
            System.out.print(x+" ");

    }

    static void partition(int arr[], int l, int h, int p) { // TC = O(n) - "3 traversals O(n) + O(n) + O(n)", SC = O(n)
        int[] temp = new int[h-l+1];
        int index=0;

        for(int i=l;i<=h;i++) {
            if (arr[i] <= arr[p] && i != p) {
                temp[index] = arr[i];
                index++;
            }
        }

        temp[index] = arr[p];
        index++;

        for(int i=l;i<=h;i++) {
            if (arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }

        for(int i=l;i<=h;i++)
            arr[i]=temp[i-l];
    }
}
