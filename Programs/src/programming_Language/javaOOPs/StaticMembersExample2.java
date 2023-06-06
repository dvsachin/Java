package programming_Language.javaOOPs;

import java.io.IOException;

public class StaticMembersExample2 {
    public static void main(String[] args)throws IOException
    {
        Player p1 = new Player("xyz");
        Player p2 = new Player("abc");

        System.out.println(Player.playerCount);
        System.out.println(p1.playerCount);
    }
}
