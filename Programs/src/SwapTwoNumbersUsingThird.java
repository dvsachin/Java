public class SwapTwoNumbersUsingThird {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0;

        System.out.println("Before Swap the variables: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);

        // swap logic
        temp = a;
        a = b;
        b = temp;

        System.out.println("After Swap the variables: ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
}
