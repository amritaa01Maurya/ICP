import java.util.*;

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n =speed.length;
        Map<Integer, Double> map = new HashMap<>();
        for(int i=0;i<n;++i){
            map.put(position[i], (double)(target - position [i])/speed[i]);
        }
        Arrays.sort(position);
        int count = 0;
        double curr = 0.0;
        for(int i=n-1;i>=0;i--){
            if(map.get(position[i]) > curr){
                count++;
                curr = map.get(position[i]);
            }
        }
        return count;
    }
}
