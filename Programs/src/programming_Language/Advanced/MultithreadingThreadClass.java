package programming_Language.Advanced;

public class MultithreadingThreadClass extends Thread {
    public void run()
    {
        for(int i=0; i<5; i++)
        {
            System.out.println("Inside Test Thread");
        }
    }
}
