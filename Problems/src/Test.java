import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.util.Scanner;

class MyRunnable implements Runnable {

    @Override
    public void run() {

    }
}
 class Test {
     public static void main(String[] args) {
         MyRunnable r = new MyRunnable();
         Thread t1 = new Thread();
         Thread t2 = new Thread(r);
     }
 }

 





