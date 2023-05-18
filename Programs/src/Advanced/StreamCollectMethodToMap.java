package Advanced;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectMethodToMap {
    public static void main (String[] args) {

        Student arr[]= {new Student(110, "abc", 70),
                new Student(101, "bcd", 80),
                new Student(120, "xyz", 60)
        };

        Map<Integer,String> m = Arrays.stream(arr)
                .collect(Collectors.toMap(
                        Student::getRoll,
                        Student::getName));

        for(Map.Entry<Integer,String> ent: m.entrySet())
            System.out.println(ent.getKey()+" "+ent.getValue());


    }
}
