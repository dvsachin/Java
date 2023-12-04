package geeksforgeeks.Hard_Level;
// https://www.geeksforgeeks.org/problems/sum-string3151/1
public class SumString {
    public int isSumString(String S){
        // code here
        for(int i=1; i<S.length(); i++){
            for(int j=1; j<S.length()-i; j++){
                if(check(S,0,i,j)) return 1;
            }
        }
        return 0;
    }

    public boolean check(String str, int b, int n, int m){
        String s1 = str.substring(b,b+n);
        String s2 = str.substring(b+n,b+n+m);
        String s3 = sum(s1,s2);

        if(s3.length()>str.length()-b-n-m) return false;
        if(s3.equals(str.substring(b+n+m,b+n+m+s3.length()))){
            if(s3.length()==str.length()-b-n-m) return true;
            return check(str,b+n, m, s3.length());
        }
        return false;
    }

    public String sum(String s1, String s2){
        StringBuilder sb = new StringBuilder();
        int i=s1.length()-1, j=s2.length()-1, sum=0, carry=0, rem=0;

        while(i>=0 || j>=0 || carry==1){
            sum = (i>=0?s1.charAt(i)-'0':0)+(j>=0?s2.charAt(j)-'0':0)+carry;
            rem = sum%10;
            i--; j--;
            carry = sum/10;
            sb.append(rem);
        }
        sb.reverse();
        return sb.toString();
    }
}
/*
Given a string of digits, the task is to check if it is a ‘sum-string’. A string S is called a sum-string when it is broken down into more than one substring and the rightmost substring can be written as a sum of two substrings before it and the same is recursively true for substrings before it.

Example 1:

Input:
S = "12243660"
Output:
1
Explanation:
"12243660" can be broken down as {"12", "24", "36", "60"}.
We can get 60 from 24 and 36 as 24 + 36 = 60. Similarly 36 can be written as 12 + 24.
Example 2:

Input:
1111112223
Output:
1
Explanation:
"1111112223" can be broken down as {"1", "111", "112", "223"}.
We can get 223 from 111 and 1112 as 111 + 112 = 223. Similarly 112 can be written as 1 + 111.
Your Task:

You don't need to read input or print anything. Your task is to complete the function isSumString() which takes the string S and returns 1 is S is a sum-string otherwise returns 0.

Expected Time Complexity: O(|S|3)
Expected Auxiliary Space: O(|S|)

Constraints:
1 <= |S| <= 500
String consists of characters from '0' to '9'.
 */