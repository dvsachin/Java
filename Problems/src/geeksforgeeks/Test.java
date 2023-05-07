package geeksforgeeks;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[] {2,9,8,4,6,1,7,5,3,0};
        for(int i = 0; i < arr.length; i++) {
            arr[i/2] = arr[arr[arr[i/3]/3]/3];
        }
        for(int x : arr)
        System.out.println(x);
    }
}
