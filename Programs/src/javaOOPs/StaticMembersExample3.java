package javaOOPs;

import java.io.IOException;

public class StaticMembersExample3 {
    public static void main(String[] args)throws IOException
    {
        System.out.println(Player.getplayerCount());

        Player p1 = new Player("abc");

        System.out.println(Player.getplayerCount());

    }
}
