package geeksforgeeks.School_Level;

import java.util.Scanner;

public class JavaClassesIntroduction {
    int length;
    int width;
    int height;

    public void set_length(int l) {
        //Add your code here.
        this.length = l;
    }
    public void set_width(int w) {
        //Add your code here.
        this.width = w;
    }
    public void set_height(int h) {
        //Add your code here.
        this.height = h;
    }
    public void volume() {
        //Add your code here.
        System.out.println(length*width*height);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int l,w,h;
            l = sc.nextInt();
            w = sc.nextInt();
            h = sc.nextInt();
            JavaClassesIntroduction ob = new JavaClassesIntroduction();

            ob.set_length(l);
            ob.set_width(w);
            ob.set_height(h);
            ob.volume();
        }
    }
}
/*
Create class named Cuboid with fields length,width and height. Calculate volume of the cuboid.
Class Cuboid contains following functions:
1. set_height(int l): sets the length of the cuboid.
2. set_width(int w): sets width of the cuboid.
3. set_height(int h): sets height of the cuboid.
4.volume(): Prints the volume of the cuboid.

Input:
The first line contains an integer T, the number of test cases. For each test case, three integers are given.

Output:
For each test case, the output is the volume of the cuboid.

User Task:
Since this is a functional problem you don't have to worry about input, you just have to complete the functions given set_height(), set_width(), set_height() and volume().

Constraints:
1 <= T <= 100
1 <= l, w, h <= 103

Example:
Input
2
10 5 7
11 9 4

Output:
350
396


 */