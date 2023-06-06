package programming_Language.FlowControl_Loops_Functions;

public class FiveIncreasingStartRowPattern {
    public static void main(String[] args) {
        int i=1;int n=5;

        while(i<=n){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

/*

 *
 **
 ***
 ****
 *****

 */