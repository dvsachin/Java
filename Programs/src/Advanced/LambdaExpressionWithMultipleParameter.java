package Advanced;
import java.io.*;
import java.util.*;
import java.util.function.*;

interface Test3 {
    void print(Integer p1, Integer p2);
}
public class LambdaExpressionWithMultipleParameter {
    static void fun(Test3 t, Integer p1, Integer p2) {
        t.print(p1,p2);
    }

    public static void main (String[] args) {
        fun((p1,p2) -> System.out.println(p1+" "+p2), 10,20);

    }
}
