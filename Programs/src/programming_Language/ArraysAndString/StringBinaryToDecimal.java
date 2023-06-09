package programming_Language.ArraysAndString;

import java.util.Scanner;

public class StringBinaryToDecimal {
    public static void binToDec(String s) {
        int m = 0;
        int k = 1;

        for(int i = s.length() - 1; i >= 0; i--) {
            m += (s.charAt(i) - '0') * k;  // (s.charAt(i) - '0') convert to number // (ASCII value 0,1 = 48,49) so
            k = k * 2;
        }

        System.out.println(m);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println('1'-'0');
        binToDec(s);
    }
}
