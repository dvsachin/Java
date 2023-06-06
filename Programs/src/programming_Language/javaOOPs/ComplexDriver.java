package programming_Language.javaOOPs;

import java.io.IOException;

public class ComplexDriver {
    public static void main(String[] args)throws IOException {

        Complex c1 = new Complex(10, 20);

        c1.print();

        Complex c2 = new Complex(20, 30);

        c1.add(c2);

        c1.print();

    }
}
