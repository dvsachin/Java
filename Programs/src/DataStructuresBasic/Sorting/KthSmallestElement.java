package DataStructuresBasic.Sorting;
import java.util.Arrays;

// TC = Naive = Theta(n * log n) & SC = O(n)
// TC = Efficient = AC O(n) but in WC O(n^2) & SC = O(1)

public class KthSmallestElement {
    public static void main (String[] args) {
        int arr1[] = new int[]{10,5,30,12};
        int n1 = arr1.length;int k1=2;
        System.out.print(kthSmallestNaive(arr1,n1,k1));

        System.out.println();

        int arr2[] = new int[]{10,4,5,8,11,6,26};
        int n2 = arr2.length;int k2=5;
        int index=kthSmallestEfficient(arr2,n2,k2);
        System.out.print(arr2[index]);
    }

    static int kthSmallestNaive(int arr[], int n, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }

    static int partition(int arr[], int l, int h)  { // by Quicksort using Lomuto partition

        int pivot = arr[h];
        int i = l-1;

        for(int j = l;j <= h-1;j++){
            if(arr[j] < pivot){
                i++;

                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return i+1;
    }

    static int kthSmallestEfficient(int arr[],int n,int k){
        int l = 0,r = n-1;
        while(l <= r){
            int p = partition(arr,l,r);
            if(p == k-1)
                return p;
            else if(p > k-1)
                r = p-1;
            else
                l = p+1;
        }
        return -1;
    }


}
