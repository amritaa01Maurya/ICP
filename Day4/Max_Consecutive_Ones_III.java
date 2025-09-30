package Day4;

public class Max_Consecutive_Ones_III {
    public static int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int l = 0;
        int[] freq = new int[2];
        int maxLen = 0;
        for(int r=0;r<n;r++){
            freq[nums[r]]++;
            while(freq[0] > k){
                freq[nums[l]]--;
                l++;
            }
            maxLen = Math.max(maxLen, r - l + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int k = 2;
        System.out.println(longestOnes(nums, k));
    }
}
