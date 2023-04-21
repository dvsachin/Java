package FlowControl_Loops_Functions;

import java.io.*;

public class MethodExample3  {
    public static void main(String[] args)throws IOException  {
        fun();
        fun();
    }

    public static void fun() {
        int x = 5, y = 10;

        System.out.println(x+y);
    }
}

