package phase_4.week4;

import java.util.Scanner;

public class Blank_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                
            }

            int maxLen = 0;
            int len = 0;
            for (int i = 0; i < a.length; i++) {
                if(a[i] == 0){
                    len++;
                    maxLen = Math.max(len, maxLen);
                }else{
                    len = 0;
                }
            }
            System.out.println(maxLen);
        }
    }
}
