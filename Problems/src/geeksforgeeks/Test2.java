package geeksforgeeks;

public class Test2 {
    public static void main(String[] args) {
        int value = 3, sum = 6 + --value;
        int data = --value + ++value / sum++ * value++ + ++sum % value--;
        System.out.println(data);
        System.out.println(8 & 9);
    }

}
