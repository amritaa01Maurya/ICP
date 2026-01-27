package phase_4.week3;

import java.util.LinkedList;
import java.util.Queue;

public class time_needed_to_buy_tkt {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        Queue<int[]> q = new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            q.add(new int[]{i, tickets[i]});
        }
        int time = 0;
        int totTktOfK = tickets[k];
        while(totTktOfK > 0 && !q.isEmpty()){
            int[] a = q.poll();
            int idx = a[0];
            int tkt = a[1] - 1;
            if(idx == k){
                totTktOfK--;
            }
            time++;
            if(tkt > 0){
                q.add(new int[]{idx, tkt});
            }
        }
        return time;
    }

    public static void main(String[] args) {
        int[] arr = {2,3,2};
        int k = 2;
        System.out.println(timeRequiredToBuy(arr, k));
    }
}
