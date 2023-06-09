package programming_Language.Advanced;

import java.util.stream.Stream;

public class StreamFirstTenNumberWhichContain5 {
    public static void main (String[] args) {

        Stream.iterate(1, x -> x + 1)
                .filter(x -> x.toString().contains("5"))
                .limit(10)
                .forEach(System.out::println);

    }
}
