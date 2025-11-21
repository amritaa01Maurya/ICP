package Day11;

import java.util.*;

public class Books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int l = 0;
        int sum = 0;
        int ans = 0;
        for(int r = 0; r < n; r++){
            sum += arr[r];
            while(sum > t){
                sum -= arr[l];
                l++;
            }
            ans = Math.max(ans, r - l + 1);
        }
        // int[][] dp= new int[n+1][t+1];
        // for(int i=1;i<=n;i++){
        //     for(int j=1;j<=t;j++){
        //         if(arr[i-1]<=j){
        //             dp[i][j]=Math.max(dp[i-1][j],dp[i-1][j-arr[i-1]]+1);
        //         }else{
        //             dp[i][j]=dp[i-1][j];
        //         }
        //     }
        // }
        System.out.println(ans);
    }
}
