package geeksforgeeks.School_Level;
// https://practice.geeksforgeeks.org/problems/distance-between-2-points3200/1
public class DistanceBetween2Points {
    public int distance(int x1, int y1, int x2, int y2) {
        // Code here
        return (int) Math.round(Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
        // return distance;
    }
}
/*
Given coordinates of 2 points on a cartesian plane, find the distance between them rounded up to nearest integer.

Example 1:

Input: 0 0 2 -2
Output: 3
Explanation: Distance between (0, 0)
and (2, -2) is 3.
Example 2:

Input: -20 23 -15 68
Output: 45
Explanation: Distance between (-20, 23)
and (-15, 68) is 45.
Your Task:
You don't need to read or print anything. Your task is to complete the function distance() which takes x1, y1, x2 and y2 as input parameter and returns the distance between the given two points.

Expected Time Complexity: O(1)
Expected Space Complexity: O(1)


 */