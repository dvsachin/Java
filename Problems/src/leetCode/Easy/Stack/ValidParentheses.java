package leetCode.Easy.Stack;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {
    // TC = O(N), SC=(N)
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        char curr, top;

        for(int i=0; i<s.length(); i++) {
            curr = s.charAt(i);

            if(curr == '(' || curr == '{' || curr == '[' ) st.push(curr);
            else {
                if (st.isEmpty())
                    return false; // closing bracket comes at first
                top = st.peek();
                if((curr == ')' && top == '(') || (curr == '}' && top == '{') || (curr==']' && top=='['))
                    st.pop();
                else
                    return false;
            }
        }
        return st.isEmpty();

    }
}
/*
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.


Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "()[]{}"
Output: true
Example 3:

Input: s = "(]"
Output: false


Constraints:

1 <= s.length <= 104
s consists of parentheses only '()[]{}'.
 */