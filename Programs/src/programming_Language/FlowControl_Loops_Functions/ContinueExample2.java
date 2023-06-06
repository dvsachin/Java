package programming_Language.FlowControl_Loops_Functions;

import java.io.*;
import java.util.*;

public class ContinueExample2 {
    public static void main(String[] args)throws IOException
    {
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++)
        {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if(y==0)
                continue;
            System.out.println(x/y);
        }

    }
}
