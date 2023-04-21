package ArraysAndString;

public class StringCompareTo {
    public static void main(String args[]) {
        // Creating two string literals
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "mno";

        int res = s1.compareTo(s2);

        if(res == 0)
            System.out.println("Same");

        if(res > 0)
            System.out.println("s1 is Greater");

        if(res < 0)
            System.out.println("s1 is Smaller");
    }
}
