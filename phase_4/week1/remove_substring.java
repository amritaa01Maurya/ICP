package phase_4.week1;

import java.util.*;

public class remove_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        int n = s.length();
        int m = t.length();
        int i =0;
        int j =0;
        int[] prefix = new int[m];
        int[] suffix = new int[m];
        while(i < n && j < m){
            if(s.charAt(i)==t.charAt(j)){
                prefix[j] = i;
                i++;
                j++;
            }else{
                i++;
            }
        }
        i = n - 1;
        j = m -1;
        while(i > -1 && j > -1){
            if(s.charAt(i)==t.charAt(j)){
                suffix[j] = i;
                i--;
                j--;
            }else{
                i--;
            }
        }
        int maxLen = Math.max(n - prefix[m-1] - 1, suffix[0]);
        for (int k = 1; k < m; k++) {
            maxLen = Math.max(maxLen, suffix[i] - prefix[i]-1);
        }
        System.out.println(maxLen);
    }
}
