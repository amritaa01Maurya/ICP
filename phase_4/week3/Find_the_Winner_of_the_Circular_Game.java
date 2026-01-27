package phase_4.week3;

import java.util.LinkedList;
import java.util.Queue;

public class Find_the_Winner_of_the_Circular_Game {
    public static int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }
        while(q.size() != 1){
            for(int i=1;i<=k;i++){
                int ele = q.poll();
                if(i != k){
                    q.add(ele);
                }
            }
        }
        return q.poll();
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;

        System.out.println(findTheWinner(n, k));
    }
}
