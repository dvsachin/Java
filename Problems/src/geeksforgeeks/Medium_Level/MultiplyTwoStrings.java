package geeksforgeeks.Medium_Level;

public class MultiplyTwoStrings {
    public String multiplyStrings(String s1,String s2)  {
        //code here.
        int n1=s1.length();
        int n2 = s2.length();
        int a = s1.charAt(0)=='-'?-1:0;
        int b = s2.charAt(0)=='-'?-1:0;

        // product will always less than length of s1 and s2
        int arr[] =  new int[n1+n2];

        for(int i=n1-1; i>=0; i--){
            int k = i+n2; // k = n1 - i + n2 -> k start from last index of arr n1 + n2 - 1

            if(s1.charAt(i)!='-'){ // skip index if s1 is negative number
                int carry = 0;
                for(int j=n2-1; j>=0; j--){
                    if(s2.charAt(j)!='-'){ // skip index if s2 is negative number

                        // convert char into int then product + carry of last equation
                        // + add arr[k] element number updated from last iteration of s1 (i)

                        int x = (s1.charAt(i)-'0')*(s2.charAt(j)-'0') + carry + arr[k];
                        arr[k] = x %10; // take the last digit
                        carry = x/10; // take the first digit if > 9
                        k--;
                    }
                }
                // if carry left then write in front of final value
                if(carry>0){
                    arr[k] = carry;
                }
            }
        }

        boolean flag = true;
        StringBuffer temp = new StringBuffer();

        for(int i=0; i<arr.length; i++){
            if(arr[i] != 0) flag = false;

            // remove prefix zeros
            if(flag) continue;

            temp.append(arr[i]);
        }

        String ans  = temp.toString();

        // if product result is zero
        if(ans.length()==0) return "0";

        // if one variable is negative then product is always negative
        if(a<0 && b>=0 || a>=0 && b<0) ans = "-"+ans;

        return ans;
    }
}
/*
https://practice.geeksforgeeks.org/problems/multiply-two-strings/1

Given two numbers as strings s1 and s2. Calculate their Product.

Note: The numbers can be negative and You are not allowed to use any built-in function or convert the strings to integers. There can be zeros in the begining of the numbers.

Example 1:

Input:
s1 = "0033"
s2 = "2"
Output:
66
Example 2:

Input:
s1 = "11"
s2 = "23"
Output:
253
Your Task: You don't need to read input or print anything. Your task is to complete the function multiplyStrings() which takes two strings s1 and s2 as input and returns their product as a string.

Expected Time Complexity: O(n1* n2)
Expected Auxiliary Space: O(n1 + n2); where n1 and n2 are sizes of strings s1 and s2 respectively.

Constraints:
1 ≤ length of s1 and s2 ≤ 103
 */