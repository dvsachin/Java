package programming_Language.Advanced;

public class MethodCallStackExceptionsHandlingWithoutExample1 {
    public static void main (String[] args) {


        methodA();
    }

    static void methodA()
    {
        System.out.println("Enter methodA()");

        int a = 5, b = 0;

        int c = a / b;

        System.out.println(c);


    }
}
