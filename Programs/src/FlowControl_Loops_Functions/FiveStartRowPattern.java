package FlowControl_Loops_Functions;

public class FiveStartRowPattern {
    public static void main(String[] args) {
        int i=1;int n=5;
        while(i<=n){
            int j=1;
            while(j<=n){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
/*
 *****
 *****
 *****
 *****
 *****
 */