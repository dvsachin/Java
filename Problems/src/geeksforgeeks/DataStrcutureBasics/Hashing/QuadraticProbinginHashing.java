package geeksforgeeks.DataStrcutureBasics.Hashing;

import java.util.Map;
import java.util.Scanner;

public class QuadraticProbinginHashing {
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

            int[] hash_table = new int[hashSize];
            new QuadraticProbinginHashing().quadraticProbing(hash_table,hashSize,arr,arraySize);

            for(int i=0; i< hashSize; i++) {
                System.out.print(hash_table[i]+" ");
            }
            System.out.println();

        }
    }
    private static boolean prime(int n){
        boolean flag = true;
        //Write your code here
        if(n < 2) flag = false;
        for(int i = 2; i*i <= n; i++) {
            if(n % i == 0) flag = false;
        }

        //returns a boolean value
        return flag;

    }
    static void quadraticProbing(int[] hash, int hash_size, int arr[], int N) {
        //Your code here

        for(int i=0;i<hash_size;i++) hash[i] = -1;

        int size = 0, k = 1;
        boolean isHashSizePrime = prime(hash_size);

            for(int i=0; i < N; i++) {
                k = 1;

                if(isHashSizePrime && (size/hash_size) < 0.5) return;

                if (size==hash_size)
                    break;

                int h = arr[i] % hash_size;

                while(hash[h]!=-1 && hash[h]!=arr[i]){
                    h = (arr[i] + (int) Math.pow(k,2))%hash_size;
                    k++;
                }
                if(hash[h]==arr[i]){
                    continue;
                }else{
                    hash[h] = arr[i];
                    size++;
                }
            }
        }
    }

