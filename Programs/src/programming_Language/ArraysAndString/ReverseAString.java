package programming_Language.ArraysAndString;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str = s.nextLine();
        String b="";
        int ptr = str.length()-1;

        while(ptr >= 0){
            b = b + str.charAt(ptr);
            ptr--;
        }
        System.out.println(b);
    }
}
