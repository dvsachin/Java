package VariablesAndOperators;

public class NonPrimitiveType {
    int x;
    int y;

}
class TestNonPrimitiveType {
    public static void main(String[] args) {
        NonPrimitiveType type = new NonPrimitiveType();
        type.x = 10;
        type.y = 20;

        System.out.println(type.x+"   "+ type.y);
    }

}
