package programming_Language.Advanced;

import java.util.Arrays;

public class StreamSumOfArray {
    public static void main (String[] args) {

        int arr[] = {30, 20, 10};

        int sum = Arrays.stream(arr).sum();

        System.out.println(sum);
    }
}
