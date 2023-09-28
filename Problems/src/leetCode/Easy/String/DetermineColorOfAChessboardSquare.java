package leetCode.Easy.String;
// https://leetcode.com/problems/determine-color-of-a-chessboard-square/
public class DetermineColorOfAChessboardSquare {
    public boolean squareIsWhite(String coordinates) {
        char ch = coordinates.charAt(0);
        int num = '0' - coordinates.charAt(1);
        boolean ans = false;

        switch(ch) {
            case 'b': case 'd': case 'f': case'h':
                // odd-true-white OR even-false-black
                ans =  num % 2 != 0;
                break;

            case 'a': case 'c': case 'e': case 'g':
                // odd-false-black OR even-true-white
                ans =  num % 2 == 0;
                break;

        }
        return ans;

    }
}
/*
You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.



Return true if the square is white, and false if the square is black.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.



Example 1:

Input: coordinates = "a1"
Output: false
Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
Example 2:

Input: coordinates = "h3"
Output: true
Explanation: From the chessboard above, the square with coordinates "h3" is white, so return true.
Example 3:

Input: coordinates = "c7"
Output: false


Constraints:

coordinates.length == 2
'a' <= coordinates[0] <= 'h'
'1' <= coordinates[1] <= '8'
 */