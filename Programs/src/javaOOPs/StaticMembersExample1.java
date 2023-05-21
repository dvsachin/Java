package javaOOPs;

import java.io.IOException;

public class StaticMembersExample1 {
    public static void main(String[] args)throws IOException
    {
        Player p1 = new Player("xyz");
        Player p2 = new Player("abc");

        p1.printDetails();
        p2.printDetails();
    }
}
