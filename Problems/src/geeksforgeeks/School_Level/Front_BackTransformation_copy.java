package geeksforgeeks.School_Level;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Front_BackTransformation_copy {
    String convert(String s)  {
        StringBuffer str = new StringBuffer();

        for (int i = 0; i < s.length();i++ ) {
            char current = s.charAt(i);

            if (current >= 65 && current <= 90) {
                str.append ((char) (90 - (s.charAt(i) - 65)));
            } else if (current >= 97 && current <= 122) {
                str.append ((char) (122 - (s.charAt(i) - 97)));
            }
            else str.append (s.charAt(i));
        }

        return str.toString();

//        System.out.print(charSet.indexOf('B')+" "+charSet.get(27 - charSet.indexOf('B')));
//        System.out.println();
//        System.out.print(charSet.indexOf('Z')+" "+charSet.get(27 - charSet.indexOf('Z')));
//
//        System.out.println();
//        System.out.print(charSet.indexOf('z')+" "+charSet.get(charSet.indexOf('z') - 25));




    }
    public static void main(String[] args)  throws  Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());

        while (t-->0) {
            String s= reader.readLine();
            System.out.println(new Front_BackTransformation_copy().convert(s));
        }
    }
}
