package Day11;

import java.util.*;
public class Nastya_and_Door {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            
            int[] prefix = new int[n];
            prefix[0] = 0;
            for(int i=1;i<n-1;i++){
                int count = 0;
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]){
                    count = 1;
                }
                prefix[i] = prefix[i-1] + count;
            }
            if(n > 1){
                prefix[n-1] = prefix[n-2];
            }
            
            int minIdx = 0;
            int maxpeak = 0;
            for(int i=0;i <= n-k;i++){
                int r = i + k - 2;
                int curr = prefix[r] - prefix[i];
                if(curr > maxpeak){
                    maxpeak = curr;
                    minIdx = i;
                }
            }
            System.out.println((maxpeak + 1) + " " + (minIdx + 1));
        }
    }
}
