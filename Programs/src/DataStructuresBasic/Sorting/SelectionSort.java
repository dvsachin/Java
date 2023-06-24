package DataStructuresBasic.Sorting;
/**
    1.  comparison based: does less memory writes compare to other sorting algorithms
        but optimal algo is cycle sort in terms of less memory writes.
        memory writes can be costly operation in situation like EEPROM
        if we do more writes then age of memory reduces
    2.  Basic idea for heap sort
    3.  Not stable: order of equal elements may change
    4.  In-place: does not require extra memory for sorting

    TC= Theta(n^2) and SC=O(1)
 **/

// find out the first min element and place it in the first position swap with current element and so on...
public class SelectionSort {

    static void selectionSortNaive(int arr[], int n){
        int[] temp = new int[n];

        for(int i = 0; i < n; i++){
            int min_ind = 0;

            for(int j = 1; j < n; j++){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }

            temp[i] = arr[min_ind];
            arr[min_ind] = Integer.MAX_VALUE;
        }

        for(int i = 0; i < n; i++){
            arr[i] = temp[i];
        }
    }
    static void selectionSortEfficient(int arr[], int n){
        for(int i = 0; i < n-1; i++){
            int min_ind = i;

            for(int j = i + 1; j < n; j++){
                if(arr[j] < arr[min_ind]){
                    min_ind = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[min_ind];
            arr[min_ind] = temp;
        }
    }


    public static void main (String[] args) {
        int a[] = {2, 1, 4, 3};
        selectionSortNaive(a, 4);
        selectionSortEfficient(a, 4);

        for(int i = 0; i < 4; i++){
            System.out.print(a[i] + " ");
        }
    }
}
