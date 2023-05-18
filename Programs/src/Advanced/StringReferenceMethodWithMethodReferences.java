package Advanced;

import java.util.Arrays;

public class StringReferenceMethodWithMethodReferences {
    public static void main (String[] args) {

        String a[] = {"JAVA","IDE","INTELLIJ"};
        String b[] = {"java","ide","intellij"};

        if(Arrays.equals(a,b,String::compareToIgnoreCase))
            System.out.println("Yes");

        else
            System.out.println("No");

    }
}
