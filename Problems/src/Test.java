import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.text.DateFormat;
import java.util.Scanner;

 class TooOldException extends RuntimeException {
     TooOldException(String s) {
         super(s);
     }
 }
 class TooYoungException extends RuntimeException {
     TooYoungException(String s) {
         super(s);
     }
 }
 class AgeTesting {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int input = scanner.nextInt();
         if(input < 18) throw new TooYoungException("we don't do child labour");
         else if(input > 60) throw  new TooOldException("working age is over");
     }
 }

 





