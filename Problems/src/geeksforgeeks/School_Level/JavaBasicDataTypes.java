package geeksforgeeks.School_Level;
// https://practice.geeksforgeeks.org/problems/java-basic-data-types0041/1
import java.util.Scanner;
public class JavaBasicDataTypes {
    int javaIntType(Scanner sc) {
        // code here
        int number = sc.nextInt();
        return number;
    }

    String javaStringType(Scanner sc) {
        // code here
        String str = sc.next();
        return str;
    }

    float javaFloatType(Scanner sc) {
        // code here
        float decimal = sc.nextFloat();
        return decimal;
    }
}
/*
Read a value and store it in the appropriate Java Data Type.


Example 1:

Input:
18
abc
9.9876
Output:
18
abc
9.9876
Explanation:
The three inputs are stored in approriate
data types and then printed in order.


Your Task:
Your task is to complete each of the given functions
javaIntType() : read an integer input, store it in appropriate data type and return it.
javaStringType() : read a string input, store it in appropriate data type and return it.
javaFloatType() : read a float input, store it in appropriate data type and return it.
Each of the function have an object of Scanner in the parameter to be used to read the input.


Expected Time Complexity: O(1)
Expected Auxiliary Space: O(1)

 */
