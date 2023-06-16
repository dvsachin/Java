package geeksforgeeks.DataStrcutureBasics.Hashing;

import java.util.Scanner;

public class LinearProbingInHashing {
    //Function to fill the array elements into a hash table
    //using Linear Probing to handle collisions.
    public int[] linearProbing(int hash_size, int arr[], int sizeOfArray) {
        //Your code here
        int[] hash = new int[hash_size];

        for(int i=0;i<hash_size;i++){
            hash[i] = -1;
        }

        int size = 0;

        for(int i=0; i < sizeOfArray; i++) {
            if (size==hash_size)
                break;
            int h = arr[i] % hash_size;

            while(hash[h]!=-1 && hash[h]!=arr[i]){
                h = (h+1)%hash_size;
            }
            if(hash[h]==arr[i]){
                continue;
            }else{
                hash[h] = arr[i];
                size++;
            }
        }
        return hash;
    }

//    private static int[] insert(int key, int hashSize, int[] hashTable) {
//        int hash = key % hashSize;
//
//        while (hashTable[hash] != -1 && hashTable[hash] != key) {
//            hash = (hash+1) % hashSize;
//        }
//
//        if (hashTable[hash] == key)
//            return hashTable;
//
//        else {
//            hashTable[hash] = key;
//            return hashTable;
//        }
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int hashSize = sc.nextInt();
            int arraySize = sc.nextInt();

            int[] arr = new int[arraySize];
            for(int i=0; i<arraySize; i++) {
                arr[i] = sc.nextInt();
            }

            int[] hash_table = new LinearProbingInHashing().linearProbing(hashSize,arr,arraySize);

            for(int i=0; i< hashSize; i++) {
                System.out.print(hash_table[i]+" ");
            }
            System.out.println();

        }
    }
}
/*
Linear probing is a collision handling technique in hashing. Linear probing says that whenever a collision occurs, search for the immediate next position.

Given an array of integers and a hash table size. Fill the array elements into a hash table using Linear Probing to handle collisions. Duplicate elements must be mapped to the same position in the hash table while colliding elements must be mapped to the [(value+1)%hashSise] position.

Example 1:

Input:
hashSize = 10
sizeOfArray = 4
Array[] = {4,14,24,44}
Output:
-1 -1 -1 -1 4 14 24 44 -1 -1
Explanation: 4%10=4. So put 4 in
hashtable[4].Now, 14%10=4, but
hashtable[4] is alreadyfilled so put
14 in the next slot and so on.
Example 2:

Input:
hashSize = 10
sizeOfArray = 4
Array[] = {9,99,999,9999}
Output:
99 999 9999 -1 -1 -1 -1 -1 -1 9
Explanation: 9%10=9. So put 9 in
hashtable[9]. Now, 99%10=9, but
hashtable[9] is already filled so
put 99 in the (99+1)%10 =0 slot so
99 goes into hashtable[0] and so on.
Your Task:
You don't need to read input or print anything. Your task is to complete the function linearProbing() which takes the hash table size (hashSize), an integers array arr[] and its size N as input parameters and inserts all the elements of the array arr[] into a hash table. The function should return the hash table.
The empty cells of the hash table are to be given a value of -1.
Also, if there's no more space to insert a new element, just drop that element.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)


Constraints:
1 <= hashSize <= 1000
1 <= sizeOfArray <= 10000
0 <= Array[] <= 105
 */