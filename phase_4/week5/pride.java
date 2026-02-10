package phase_4.week5;

import java.util.*;

public class pride {
    // euclidean method
    public static long gcd(long a, long b){//6, 3
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);// 3, 6%3=0
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        int ones = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
            if(arr[i] == 1){
                ones++;
            }
        }

        // if in arr one exist then n - ones count steps take to make all array one
        if(ones > 0){
            System.out.println(n - ones);
        }else{
            // cal total gcd 
            long GCD = arr[0];
            for (int i = 1; i < arr.length; i++) {
                GCD = gcd(GCD, arr[i]);
            }
            //if gcd of array is not 1 then we can never amek it one
            if(GCD != 1){
                System.out.println(-1);
            }else{
                // now calculate min subarray length which has gcd one
                // so we need only (subarray length - 1) + (n - 1) steps to make array one

                int minLen = n + 1;
                for (int l = 0; l < arr.length; l++) {
                    GCD = arr[l];
                    for (int r = l+1; r < arr.length; r++) {
                        GCD = gcd(GCD, arr[r]);
                        if(GCD == 1 && (r - l + 1) < minLen){
                            minLen = (r - l + 1);
                            break;
                        }
                    }
                }

                System.out.println(minLen-1+n-1);
            }
        }
    }
}
