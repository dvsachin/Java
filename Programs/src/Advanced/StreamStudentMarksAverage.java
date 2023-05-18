package Advanced;

import java.util.Arrays;

public class StreamStudentMarksAverage {
    public static void main (String[] args) {

        Student arr[]= {new Student(110, "abc", 78),
                new Student(101, "bcd", 88),
                new Student(120, "xyz", 65)
        };

        double res = Arrays.stream(arr)
                .mapToInt(x -> x.getMarks())
                .average()
                .getAsDouble();

        System.out.println(res);

    }
}
