package geeksforgeeks.School_Level;

import geeksforgeeks.Easy_Level.UniqueNumberOfOccurrences;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConvertAListOfCharactersIntoAString {
    public String chartostr(char arr[], int N){
        StringBuffer sb =new StringBuffer(arr.length);
        for (int i=0; i<N; i++) {
            sb.append(arr[i]);
        }
        return sb.toString();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0) {
            int n  = Integer.parseInt(read.readLine());
            String[] input = read.readLine().trim().split(" ");
            char[] a = new char[n];

            for (int i=0;i<n;i++)
                a[i] = input[i].charAt(0);

            System.out.println(new ConvertAListOfCharactersIntoAString().chartostr(a,n));

        }
    }

}

/*
Given a list of characters, merge all of them into a string.

Example 1:

Input:
N = 13
Char array = g e e k s f o r g e e k s
Output: geeksforgeeks
Explanation: combined all the characters
to form a single string.

Example 2:

Input:
N = 4
Char array = e e b a
Output: eeba
Explanation: combined all the characters
to form a single string.


Your Task:
You dont need to read input or print anything. Complete the function chartostr() which accepts a char array arr and its size  N  as parameter and returns a string.


Expected Time Complexity: O(N)
Expected Auxiliary Space: O(N)

 */