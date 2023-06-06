package programming_Language.ArraysAndString;

public class StringPatternSearching {
    static void patSearch(String txt, String pat) {
        int pos = txt.indexOf(pat);

        while(pos >= 0) {
            System.out.print(pos + " ");
            pos = txt.indexOf(pat, pos + 1);
        }
    }

    public static void main(String args[]) {
        String txt = "A man, a plan, a canal, Panama!";
        String pat = "an";

        patSearch(txt, pat); // return the indexes for 'an' pattern is matched in string
    }
}
