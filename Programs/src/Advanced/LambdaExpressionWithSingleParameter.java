package Advanced;

interface Test2 {
    void print(Integer p);
}
public class LambdaExpressionWithSingleParameter {
    static void fun(Test2 t, Integer p) {
        t.print(p);
    }

    public static void main (String[] args) {

        fun(p -> System.out.println(p), 10);

    }
}
