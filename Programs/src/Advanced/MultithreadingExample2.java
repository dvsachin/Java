package Advanced;

public class MultithreadingExample2 {
    public static void main (String[] args)throws InterruptedException {

        Thread t = new Thread(new MultithreadingRunnableInterface());

        t.start();

        System.out.println("In Main Thread");
    }
}

