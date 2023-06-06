package programming_Language.ArraysAndString;

public class StringBufferAndStringBuilderMethods {
    public static void main (String[] args) {
        // StringBuilder or StringBuffer class
        StringBuilder sb = new StringBuilder("dcba");

        // Reversing the StringBuilder
        sb.reverse();
        System.out.println(sb);

        // Appending to sb
        sb.append("efg");
        System.out.println(sb);

        // Replacing the character at 1
        // with h
        sb.setCharAt(1, 'h');
        System.out.println(sb);

        // Delete the characters at 0, 1
        sb.delete(0, 2);
        System.out.println(sb);

        // Inserts "efg" at 1
        sb.insert(1, "efg");
        System.out.println(sb);
    }
}
