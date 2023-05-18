package Advanced;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamCollectMethodGroupingBy {
    public static void main (String[] args) {

        Student arr[]= {new Student(110, "abc", 70),
                new Student(101, "bcd", 70),
                new Student(120, "xyz", 60)
        };

        Map<Integer, List<Student>> m =
                Arrays.stream(arr)
                        .collect(Collectors.groupingBy(
                                Student::getMarks));


        for(Map.Entry<Integer,List<Student>> ent: m.entrySet()) {
            List<Student> ls= ent.getValue();
            System.out.print(ent.getKey()+": ");

            ls.stream()
                    .forEach(x -> System.out.print("{"+x.getRoll()+", "+x.getName()+", "+x.getMarks()+"} "));

            System.out.println();
        }

    }
}
