package DataStructuresBasic.Sorting;

/**
 * Questions asked in types:
 *      1. Segregate positive and negative (negative first followed by positive)
 *      2. Segregate even and odd (negative even followed by odd)
 *      3. sort a Binary Array (0 followed by 1)
 */

// TC = Naive = O(n) + O(n) + O(n) - 3 traversals & SC = O(n)
// TC = Efficient =  Θ(n) & SC = O(1)

public class SortAnArrayWithTwoTypesOfElements {
    public static void main (String[] args) {
        int arr[] = new int[]{13,-12,18,-10};

        int n = arr.length;

        sortNaive(arr,n);
        sortEfficient(arr,n);

        for(int x:arr)
            System.out.print(x+" ");

    }

    static void sortNaive(int arr[],int n) {
        int[] temp = new int[n];
        int i=0;

        for(int j=0;j<n;j++) // first put negative elements in temp array
            if(arr[j] < 0)
                temp[i++] = arr[j];

        for(int j=0;j<n;j++) // second put positive after negative elements in temp array
            if(arr[j] >= 0)
                temp[i++] = arr[j];

        for(int j=0;j<n;j++) // copy sorted temp into original array
            arr[j]=temp[j];
    }

// by using Quicksort partition algorithm by Lomuto or Hoare's partition
    static void sortEfficient(int arr[],int n){
        // Hoare's partition
        int i = -1,j = n;

        while(true) {
            do{ i++; }while(arr[i]<0);

            do{ j--; }while(arr[j]>=0);

            if(i >= j)return;

            //swapping arr[i] & arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }
    }
}
