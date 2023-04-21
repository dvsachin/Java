package FlowControl_Loops_Functions;

import java.io.*;

public class MethodExample4 {
    public static void main(String[] args)throws IOException {
        int x = 5, y = 10;

        System.out.println(getMax(x, y));
    }
    public static int getMax(int x, int y) {
        if(x > y)
            return x;
        else
            return y;
    }
}
