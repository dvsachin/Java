package javaOOPs;

import java.io.IOException;

public class ThisReferenceExample2 {
    public static void main(String[] args)throws IOException
    {

        Point p1 = new Point(10, 20);

        Point p2 = new Point(5, 15);

        p1.setX(2).setY(3);

    }
}
