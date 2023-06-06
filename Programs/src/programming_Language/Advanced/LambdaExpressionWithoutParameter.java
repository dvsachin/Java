package programming_Language.Advanced;

interface Test {
    void print();
}
public class LambdaExpressionWithoutParameter {
    static void fun(Test t) {
        t.print();
    }

    public static void main (String[] args) {
        fun(() -> System.out.println("Hello"));
    }
}
