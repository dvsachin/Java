package programming_Language.ArraysAndString;

public class StringNumberPatternSearching {
    static String digitAfterDecimal(String no) {
        int pos = no.indexOf('.'); // find the index of decimal

        if(pos<0)
            return "";

        else

            return no.substring(pos+1); // return substring after the decimal point in number string

    }

    public static void main(String args[]) {
        String no = "12.3213485";
        System.out.println(digitAfterDecimal(no));
    }
}
