package geeksforgeeks.Easy_Level;

import java.util.Scanner;
import java.util.Stack;

public class DeleteMiddleElementOfStack {
    public void deleteMid(Stack<Integer> s, int sizeOfStack) {
        // code here
        Stack<Integer> temp = new Stack<>();
        int midIndex =  (int) Math.ceil((sizeOfStack+1)/2.0);

        for (int i=0; i<midIndex; i++) {
            temp.push(s.pop());
        }
        temp.pop();

        while (!temp.isEmpty()) {
            s.push(temp.pop());
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-->0) {
            int sizeOFStack = sc.nextInt();
            Stack<Integer> myStack = new Stack<>();

            for (int i=0;i<sizeOFStack;i++) {
                myStack.push(sc.nextInt());
            }
            new DeleteMiddleElementOfStack().deleteMid(myStack, sizeOFStack);

            while (!myStack.isEmpty()) {
                System.out.print(myStack.peek()+" ");
                myStack.pop();
            }
        }
    }
}
/*
Given a stack, delete the middle element of the stack without using any additional data structure.
Middle element:- ceil((size_of_stack+1)/2) (1-based indexing) from bottom of the stack.

Note: The output shown by the compiler is the stack from top to bottom.

Example 1:

Input:
Stack = {10, 20, 30, 40, 50}
Output:
ModifiedStack = {10, 20, 40, 50}
Explanation:
If you print the stack the bottom-most element will be 10 and the top-most element will be 50. Middle element will be element at index 3 from bottom, which is 30. Deleting 30, stack will look like {10 20 40 50}.
Example 2:

Input:
Stack = {10 20 30 40}
Output:
ModifiedStack = {10 30 40}
Explanation:
If you print the stack the bottom-most element will be 10 and the top-most element will be 40. Middle element will be element at index 2 from bottom, which is 20. Deleting 20, stack will look like {10 30 40}.
Your Task:
You don't need to read input or print anything. Complete the function deleteMid() which takes the stack and its size as input parameters and modifies the stack in-place.

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

Constraints:
2 ≤ size of stack ≤ 105
 */