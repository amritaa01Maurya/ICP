package phase_4.week3;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Reveal_Cards_In_Increasing_Order {
    public static int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Arrays.sort(deck);

        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){// add the indices of card
            q.add(i);
        }
        int idx = 0;
        int[] arr = new int[n];

        // apply the games rules on the indices 0 to n-1
        // here we put rem smallest ele at the index  removed  from top of queue
        while(!q.isEmpty()){
            int i = q.poll();
            arr[i] = deck[idx++]; // put the deck card at poped index i
            if(!q.isEmpty()){
                int eleIdx = q.poll(); // remove next index and add to last
                q.add(eleIdx);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17,13,11,2,3,5,7};
        int[] ans = deckRevealedIncreasing(arr);
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}
