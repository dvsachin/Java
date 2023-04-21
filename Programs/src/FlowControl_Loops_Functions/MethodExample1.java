package FlowControl_Loops_Functions;

import java.io.*;

public class MethodExample1 {
    public static void main(String[] args)throws IOException {
        System.out.println("Before Call");
        fun();
        System.out.println("After Call");
    }

    public static void fun() {
        System.out.println("Inside Fun");
    }
}

