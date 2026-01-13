package phase_4.week1;

import java.util.Arrays;

public class medium2 {
    // Sieve of Eratosthenes – Generate Prime Numbers
    public static void main(String[] args) {
        int n = 23;

        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i])
            System.out.print(i +" ");
        }
    }
}
