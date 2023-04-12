import java.io.*;

class Point2 {
    int x;
    int y;
}
public class MethodExample6 {
    public static void main(String[] args)throws IOException {
        Point2 p = new Point2();
        p.x = 5; p.y = 10;

        fun(p);
        System.out.println(p.x +" "+ p.y);
    }

    public static void fun(Point2 p) {
        p = new Point2();
        p.x = 10; p.y = 10;
    }
}