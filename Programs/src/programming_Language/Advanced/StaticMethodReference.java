package programming_Language.Advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {
    public static void main (String[] args) {

        List<Integer> al= new ArrayList<>(Arrays.asList(10,20,7,8));

        al.forEach(StaticMethodReference::printSquare);
    }

    public static void printSquare(Integer x)
    {
        System.out.println(x*x);
    }
}
