package programming_Language.Advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramWithoutUsingMethodReferences {
    public static void main (String[] args) {

        List<Integer> al= new ArrayList<>(Arrays.asList(10,20,15,16));

        al.forEach(x -> System.out.println(x));
    }
}
