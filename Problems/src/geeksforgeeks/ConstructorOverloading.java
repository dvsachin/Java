package geeksforgeeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class EndUser  {
    String name;

    EndUser() {
        name = "Default";
    }

    EndUser(String name) {
        this.name = name;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());

        while (t-- > 0 ) {
            EndUser u = new EndUser();
            System.out.println(u.name);

            String name = read.readLine();
            EndUser u2 = new EndUser(name);
            System.out.println(u2.name);
        }
    }

}
/*
Design a class as described below.

class name : EndUser
instance variable: name(String)
constructor: 2
    First:
    parameter: none
    task: initialize the instance
          variable to "Default"
    Second:
    parameter: name(String)
    task: initialize the instance variable
              to the value provided in the
          parameter. (use this keyword)
Example:
Input:
Geeks
Output:
Default
Geeks
 */
