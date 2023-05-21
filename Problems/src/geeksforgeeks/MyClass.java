package geeksforgeeks;

import java.util.Scanner;

public class MyClass {
    public void display() {
        System.out.println("Hello World");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
           MyClass obj = new MyClass();
           obj.display();
        }
    }
}

