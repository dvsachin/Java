package programming_Language.ArraysAndString;

public class StringConcatenation {
    public static void main(String args[])
    {
        // Creating two string literals
        String s1 = "abcdefgh";
        String s2 = s1;

        // Creates a new object "abcdefghijklmnop"
        // Now s1 points to this new string
        s1 = s1 + "ijklmnop";
        // or
        // s1 = s1.concat("ijklmnop");

        System.out.println(s1);

        // Since s2 is still pointing
        // to initial "geeks"
        // and s1 is pointing to a new
        // object "abcdefghijklmnop"
        System.out.println(s1 == s2);
    }
}
