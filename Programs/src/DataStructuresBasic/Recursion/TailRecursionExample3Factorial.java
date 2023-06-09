package DataStructuresBasic.Recursion;

public class TailRecursionExample3Factorial {
    static int fact(int n, int k) {
        if(n == 0 || n == 1)
            return k; // return

        return fact(n - 1, k * n); // return n*fact(n-1)

    }
    public static void main(String [] args) {

        System.out.println(fact(5, 1));

    }
}
