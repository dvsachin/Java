package geeksforgeeks;

import java.util.Scanner;

public class ArrayInsertAtIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        while (testcases-- > 0) {
            int sizeOfArray = sc.nextInt();
            int[] arr = new int[sizeOfArray];

            for (int i = 0; i < sizeOfArray - 1; i++) {
                arr[i] = sc.nextInt();
            }
            int element = sc.nextInt();
            int index = sc.nextInt();

            InsertAtIndex obj = new InsertAtIndex();

            obj.insertAtIndex(arr, sizeOfArray, index, element);

            for (int i = 0; i < sizeOfArray; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();

        }
    }
}
class  InsertAtIndex {
    // You need to insert the given element at the given index.
    // After inserting the elements at index, elements
    // from index onward should be shifted one position ahead
    // You may assume that the array already has sizeOfArray - 1
    // elements.
    public void insertAtIndex(int arr[],int sizeOfArray,int index,int element) {
        //Your code here, Geeks
        if(index >= sizeOfArray) {
            arr[sizeOfArray-1] = -1;
            return;
        }
        for(int i = sizeOfArray-1; i > index; i--) {
            arr[i] = arr[i-1];
        }

        arr[index] = element;
    }
}

