package ArraysAndString;

import java.util.Scanner;

public class CheckForPalindrome {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        int start = 0, end = str.length()-1 ;

        boolean palindromeFlag = true;

        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                palindromeFlag = false;
                break;
            }
            start++;
            end--;
        }

        if(palindromeFlag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
