package VariablesAndOperators;

public class FormattedOutput {
    public static void main(String[] args) {
        int x = 100;
        int y = 200;

        System.out.format("value of x is %d\n", x);
        float pi= (float) Math.PI;

        System.out.println(pi);
        System.out.format("value of pi is %.2f\n", pi); // 2 places after decimal
        System.out.format("value of pi is %5.2f\n", pi); // total 5 values 000.00
        System.out.format("value of pi is %05.2f\n", pi); // total 5 values 000.00 starting add with 0
        System.out.printf("x = %d, y = %d", x,y);

    }
}
