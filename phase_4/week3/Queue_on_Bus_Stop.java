package phase_4.week3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_on_Bus_Stop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            int val = sc.nextInt();
            q.add(val);
        }
        
        int count = 0;
        while(!q.isEmpty()){
            int cap = 0;
            while(!q.isEmpty() && cap + q.peek() <= m){
                cap += q.poll();
            }
            count++;
        }
        System.out.println(count);
    }
}
