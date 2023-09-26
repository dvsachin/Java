package leetCode.Easy.String;
// https://leetcode.com/problems/sort-the-people/
public class SortThePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int i, j, temp;
        String str;
        boolean swapped;

        for (i = 0; i < heights.length - 1; i++) {
            swapped = false;
            for (j = 0; j < heights.length - i - 1; j++) {
                if (heights[j] < heights[j + 1]) {

                    // Swap arr[j] and arr[j+1] in heights
                    temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j + 1] = temp;
                    swapped = true;

                    // Swap arr[j] and arr[j+1] in names
                    str = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = str;

                }
            }

            // If no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
        return names;
    }
}
/*
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.

For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.



Example 1:

Input: names = ["Mary","John","Emma"], heights = [180,165,170]
Output: ["Mary","Emma","John"]
Explanation: Mary is the tallest, followed by Emma and John.
Example 2:

Input: names = ["Alice","Bob","Bob"], heights = [155,185,150]
Output: ["Bob","Alice","Bob"]
Explanation: The first Bob is the tallest, followed by Alice and the second Bob.


Constraints:

n == names.length == heights.length
1 <= n <= 103
1 <= names[i].length <= 20
1 <= heights[i] <= 105
names[i] consists of lower and upper case English letters.
All the values of heights are distinct.
 */