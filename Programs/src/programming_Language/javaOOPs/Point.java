package programming_Language.javaOOPs;

public class Point {
    int x, y;

    Point() {
        this(10, 10);
    }
    Point(int x, int y) {
        this.x = y;
        this.y = y;
    }

    Point setX(int x) {
        this.x = x;

        return this;
    }

    Point setY(int y) {
        this.y = y;

        return this;
    }
    void print() {
        System.out.println(x + " " + y);
    }
}
