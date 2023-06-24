package DataStructuresBasic.Sorting;
/**
 * stable: it does not change order of elements if they are equal
 * TC= Theta(n^2) and SC=O(1)
 */
// Max element will bubble up to last position when i=0 (1st pass) completed
public class BubbleSort {
    static void bubbleSortNaive(int arr[], int n){ //  j < n - 1
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - 1; j++){
                if( arr[j] > arr[j + 1]){
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    static void bubbleSortMoreEfficient(int arr[], int n){ //  j < n - i // last max elements are already sorted
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n - i - 1; j++){
                if( arr[j] > arr[j + 1]){
                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void bubbleSortMostEfficient(int arr[], int n){ // will do liner work if array is sorted of become sorted in middle
        boolean swapped;

        for(int i = 0; i < n; i++){

            swapped = false;

            for(int j = 0; j < n - i - 1; j++){
                if( arr[j] > arr[j + 1]){

                    // swapping
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped = true;

                }
            }
            if(swapped == false)
                break;
        }
    }

    public static void main (String[] args) {
        int a[] = {2, 1, 4, 3};
        bubbleSortNaive(a, 4);
        bubbleSortMoreEfficient(a, 4);
        bubbleSortMostEfficient(a, 4);

        for(int i = 0; i < 4; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
