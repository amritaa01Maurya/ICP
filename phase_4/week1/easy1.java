package phase_4.week1;
import java.util.*;

public class easy1 {
    // buy ans seel stock
    public static int getProfit(int[] prices){
        int n = prices.length;
        int profit = 0;
        /*
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(prices[i] < prices[j]){
                    profit = Math.max(profit, prices[j] - prices[i]);
                }
            }
        }
        return profit;
*/
       // [7,1,5,3,6,4]
        int min = 10001;
        for(int i=0;i<n;i++){
            if(prices[i] < min){
                min = prices[i];
            }else if(min != 10001){
                profit = Math.max(prices[i] - min, profit);
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        // int[] arr = {7,1,5,3,6,4};
        // int[] arr = {7,6,5,4,3,1};
        int[] arr = {2, 4, 1};

        System.out.println(getProfit(arr));
    }
}
