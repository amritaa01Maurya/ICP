package phase_4.week1;
import java.util.*;

public class medium1 {
    // 3Sum – Find All Unique Triplets That Sum to Zero

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        int n = arr.length;
        Arrays.sort(arr);
        // List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        
        for(int i=0;i<arr.length - 2;i++){
            int l= i+1;
            int r = n-1;
            int t = -arr[i];
            while(l < r){
                if(arr[l] + arr[r] < t){
                    l++;
                }else if(arr[l] + arr[r] > t){
                    r--;
                }else{
                    res.add(Arrays.asList(new Integer[]{arr[i], arr[l], arr[r]}));
                    l++;
                }
            }

        }
        System.out.println(res);
    }
}
