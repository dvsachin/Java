package geeksforgeeks;

import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        float b = scanner.nextFloat();
        double c = scanner.nextDouble();
        long l = scanner.nextLong();
        byte d = scanner.nextByte();

        dataTypes(a,b,c,l,d);
    }
    static void dataTypes(int a, float b, double c, long l, byte d){

        double p = c/b;
        double q = b/a;
        double r = c/a;
        double m = r+l;
        int s = a/d;

        //Printing all the results
        System.out.println(p + " " + q + " " + r + " " + m + " " + s);

    }
}
