package Advanced;

public class MultithreadingExample1 {
    public static void main (String[] args)throws InterruptedException {

        MultithreadingThreadClass t = new MultithreadingThreadClass();

        t.start();

        for(int i=0; i<5; i++)
        {
            System.out.println("Inside Main Thread");

            Thread.sleep(1);
        }
    }
}
