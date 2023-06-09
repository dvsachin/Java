package DataStructuresBasic.Recursion;

public class TailRecursionExample1 { // print N to 1
    static void fun(int n) {
        if(n == 0)
            return;

        System.out.print(n+" ");

        fun(n - 1);

    }
    public static void main(String [] args) {
        fun(3);

    }
}
