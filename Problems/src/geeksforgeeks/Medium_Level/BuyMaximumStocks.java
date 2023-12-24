package geeksforgeeks.Medium_Level;

import java.util.Arrays;
// https://www.geeksforgeeks.org/problems/buy-maximum-stocks-if-i-stocks-can-be-bought-on-i-th-day/1
public class BuyMaximumStocks {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
        long[] arr = new long[n];
        for(int i=0; i<n; i++) arr[i] = price[i]* 100000L + (i+1);

        Arrays.sort(arr);

        int count = 0;
        for(int i=0; i<n; i++){
            int day = (int)arr[i]%100000;
            int pr  = (int)arr[i]/100000;

            if(pr*day<=k){
                count+=day;
                k = k-pr*day;
            }
            else{
                count+=(k/pr);
                k = k-pr*(k/pr);
            }
        }
        return count;
    }
}

/*
In a stock market, there is a product with its infinite stocks. The stock prices are given for N days, where price[i] denotes the price of the stock on the ith day.
There is a rule that a customer can buy at most i stock on the ith day.
If the customer has an amount of k amount of money initially. The task is to find out the maximum number of stocks a customer can buy.

Example 1:

Input:
price = [10,7,19]
k = 45
Output:
4
Explanation:
A customer purchases 1 stock on day 1, 2 stocks on day 2 and 1 stock on day 3 for 10, 7 * 2 = 14 and 19 respectively. Hence, total amount is 10 + 14 + 19 = 43 and number of stocks purchased is 4.
Example 2:

Input:
price = [7,10,4]
k = 100
Output:
6
Explanation:
Buy on all 3 days.
Your Task:
You don't need to read input or print anything. Your task is to complete the function buyMaximumProducts() which takes an array price and an integer k and returns an integer as output.

Expected Time Complexity: O(NlogN)
Expected Auxiliary Space: O(N)

Constraints:
1 <= N <= 104
1 <= price[i] <= 104
1 <= k <= 104
 */