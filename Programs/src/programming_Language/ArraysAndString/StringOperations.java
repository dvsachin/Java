package programming_Language.ArraysAndString;

public class StringOperations {
    public static void main(String[] args) {
        String str1 = "HELLO";
        String str2 = "Hello";
        String str3 = "Hi I am ready";
        String str4 = "anything inside anything is possible";

        // equalsIgnoreCase
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        // toUpperCase
        System.out.println(str2.toUpperCase());
        System.out.println(str3.toUpperCase());

        // substring
        System.out.println(str3.substring(3));
        System.out.println(str3.substring(3,7));

        // capitalize the first character of String
        System.out.println(Character.toUpperCase(str4.charAt(0))+ str4.substring(1));


    }
}
