package geeksforgeeks;

import java.util.Scanner;

class User {
    String name;

    User() {
        name = "Default";
    }
}

public class ConstructorDesign {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        int t = ob.nextInt();

        while (t-- > 0 ) {
            User u = new User();
            System.out.println(u.name);
        }
    }

}
/*
Design a class as described below.

class name : User
instance variable: name(String)
constructor: 1
             parameter: none
             task: initialize the instance
             variable to "Default"
Example:

Input:
None
Output:
Default
 */
