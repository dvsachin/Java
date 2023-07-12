package geeksforgeeks.School_Level;

import java.util.Scanner;

public class CheckString {
    Boolean check (String s) {
        // your code here
        char c = s.charAt(0);
        boolean flag = false;

        if(s.length() == 1) return true;

        for (int i=1; i< s.length(); i++) {
            if(s.charAt(i) == c)
                flag = true;
            else
                return false;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            if(new CheckString().check(s))
                System.out.println("YES");
            else System.out.println("NO");



        }
    }
}
