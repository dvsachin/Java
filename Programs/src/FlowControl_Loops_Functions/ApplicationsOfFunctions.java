package FlowControl_Loops_Functions;

/*
1. Avoid Code Redundancy and Ease Maintenance
2. Make Code Modular like - TakeInout(), ProcessData(), ProduceOutput()
3. Abstraction (for example: In Library functions we do not have to worry about internal working)
4. Avoid variable name collisions
 */
public class ApplicationsOfFunctions {
    public static void fun2() {
        System.out.println("Inside fun2()");
    }

    public static void fun1() {
        System.out.println("Before fun2()");
        fun2();
        System.out.println("After fun2()");
    }

    public static void main(String[] args) {
        System.out.println("Before fun1()");
        fun1();
        System.out.println("After fun1()");
    }

}
