package phase_4.week4;

import java.util.*;

public class cf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] in = new int[m];
            for (int i = 0; i < in.length; i++) {
                in[i]= sc.nextInt();
            }
            Arrays.sort(in);
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            
            for (int i = 0; i < in.length - 1; i++) {
                pq.add(in[i + 1] - in[i] - 1);
            }
            
            pq.add(in[0] + n - in[m-1] - 1);
            int d = 0;
            long count = 0;
            while(!pq.isEmpty()){
                int rem = pq.poll() - 2 * d;
                if(rem > 1){// if rem houses is greater than 1 protect house will be rem - 1
                    d += 2; // to protect the this rem house, it will take 2 days
                    count += rem - 1;
                }else if(rem <= 0){// if noe uninfected do nothing
                    continue;
                }else if(rem == 1){
                    d++;
                    count += 1;
                }
            }
            System.out.println(n - count);
        }
    }
}
