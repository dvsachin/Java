package geeksforgeeks.School_Level;

public class SumPalindrome {
    static long isSumPalindrome(long n){
        // code here
        long newNumber = n;
        long temp = n, reverse = 0;

        if(rev(n) == n)  return n;

        for(int i=0; i<5; i++) {

            reverse = rev(temp);

            newNumber = reverse + newNumber;

            if(rev(newNumber) == newNumber)  return newNumber;
            else {
                temp = newNumber;
                reverse = 0;
            }
        }
        return -1;

    }
    static long rev(long temp) {
        long reverse = 0;

        while(temp > 0) {
            reverse = reverse * 10 + temp %10;
            temp = temp / 10;
        }
        return reverse;
    }
}
