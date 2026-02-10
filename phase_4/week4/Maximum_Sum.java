package phase_4.week4;

import java.util.*;

public class Maximum_Sum {
    // tle
    // public static int solve(int[] arr, int i, int j, int k) {
    //     if(i >= j){
    //         return 0;
    //     }

    //     if(i  + 1 >= arr.length){
    //         return 0;
    //     }

    //     if(j < 0){
    //         return 0;
    //     }
    //     if(k == 0){
    //         return 0;
    //     }

    //     int ans = Integer.MAX_VALUE;

    //     ans = Math.min(ans, arr[i] + arr[i+1] + solve(arr, i+2, j, k-1));

    //     ans = Math.min(ans, arr[j] + solve(arr, i, j-1, k-1));

    //     return ans;
    // }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            long[] arr = new long[n];


            for (int i = 0; i < n; i++) {
                arr[i]= sc.nextLong();
            }
            Arrays.sort(arr);
            long[] prefix = new long[n+1];
            prefix[0] = 0;
            for (int i = 0; i < n; i++) {
                prefix[i+1] = prefix[i] + arr[i];
            }

            long sum = 0;
            for(int i=0;i<=k;i++){//
                int ops1 = i;// if we take min two ele in i times
                int ops2 = k - i;// than we can take only k-i times max ele from last

                // sum between arr if we take first two min ele i times and last max ele k-i times
                int l = 2 * ops1;// sum of subarrays containing two min ele
                int r = n - ops2;//sum of subarray before max ele idx
                sum = Math.max(sum, prefix[r] - prefix[l]);
            }

            System.out.println(sum);
        }
    }
}
