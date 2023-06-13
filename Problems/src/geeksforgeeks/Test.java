package geeksforgeeks;

public class Test implements Runnable{


    public static void main(String[] args) throws InterruptedException {
//        int[] arr = new int[] {2,9,8,4,6,1,7,5,3,0};
//        for(int i = 0; i < arr.length; i++) {
//            arr[i/2] = arr[arr[arr[i/3]/3]/3];
//        }
//        for(int x : arr)
//        System.out.println(x);

      //  System.out.println(new String(new char[] {'a','b','c'}));

//        int[] arr = {65,66,67,68};
//        String s = new String(arr,1,3);
//        System.out.println(s);
/*
        Thread t = new Thread((new Test()));
        t.start();

        System.out.printf("%d",1);

        t.join();

        System.out.printf("%d",2);



 */


    }

    @Override
    public void run() {
        System.out.printf("%d",3);
    }
}
