package programming_Language.FlowControl_Loops_Functions;

import java.math.*;
import java.io.*;
import java.util.*;

public class ContinueExample4 {
    public static void main(String[] args)throws IOException
    {
        for(int i=0; i<5; i++)
        {
            if(i==1 || i==3)
            {
                continue;
            }

            System.out.println(i);
        }

    }
}
