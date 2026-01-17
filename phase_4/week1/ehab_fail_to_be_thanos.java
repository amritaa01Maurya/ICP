package phase_4.week1;

import java.util.*;

public class ehab_fail_to_be_thanos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[2*n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int sum1=0;
        int sum2=0;
        for(int i=0;i<n;i++){
            sum1 += arr[i];
            sum2 += arr[i+n];
        }
        if(sum1 != sum2){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }else{
            System.out.println(-1);
        }
    }
}
