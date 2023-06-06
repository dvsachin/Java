package programming_Language.FlowControl_Loops_Functions;

import java.math.*;
import java.io.*;
import java.util.*;

public class Move {
    public static void main(String[] args)throws IOException
    {
        int x = 0, y = 0;

        System.out.println("Enter a move (L,R,U,D)");

        Scanner sc = new Scanner(System.in);

        char move = sc.next().charAt(0);

        switch(move)
        {
            case 'L': x--; break;

            case 'R': x++; break;

            case 'U': y++; break;

            case 'D': y--; break;

            default: System.out.println("Invalid");
        }

        System.out.println(x+" "+y);

    }
}
