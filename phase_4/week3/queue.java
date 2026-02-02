package phase_4.week3;

import java.util.*;

public class queue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int b_count = 0;
        int curr_max = 0;// max of time taken by girl
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'M') {
                b_count++;
            }else if(b_count > 0){// if not boy than check => any boys before the girl to jump
                curr_max = Math.max(curr_max + 1, b_count);//if curr_max of prev girl is T, than curr girl take time >= T + 1 
            }
        }
        System.out.println(curr_max);
    }
}
