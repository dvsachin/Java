package FlowControl_Loops_Functions;

import java.math.*;
import java.io.*;
import java.util.*;
public class BreakExample {
    public static void main(String[] args)throws IOException
    {
        for(int i=0; i<5; i++)
        {
            if(i==3)
            {
                break;
            }

            System.out.println(i);
        }

    }
}
