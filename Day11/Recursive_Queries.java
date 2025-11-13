package Day11;

import java.util.Scanner;

public class Recursive_Queries {
    static int size = 1000000;
    static int[] gx = new int[size + 1];
    static int[][] count = new int[10][size + 1];

    public static int fun(int n){
        if(n < 10){
            return n;
        }
        int p = 1;
        while(n > 0){
            int r = n % 10;
            p *= r == 0 ? 1 : r;
            n /= 10;
        }
        return fun(p);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        for (int i = 1; i <= size; i++) {
            gx[i] = fun(i);
        }
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= size; j++) {
                int val = gx[j] == i ? 1 : 0;
                count[i][j] = count[i][j-1] + val;
            }
        }
        while(q-- > 0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            int k = sc.nextInt();
            int ans = count[k][r] - count[k][l-1];
            System.out.println(ans);
        }
    }
}
