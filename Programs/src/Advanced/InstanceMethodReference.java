package Advanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InstanceMethodReference {
    public static void main (String[] args) {

        List<Integer> al= new ArrayList<>(Arrays.asList(10,20,15,16));

        al.forEach(System.out::println); // out is a instance variable
    }
}
