package phase_4.week1;

public class hard2 {
    public static int solve(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            while(nums[i] >= 1 && nums[i] <= n && nums[i] != nums[nums[i] - 1]){
                int pos = nums[i] - 1;
                int temp = nums[pos];
                nums[pos] = nums[i];
                nums[i] = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != i + 1){
                return i+1;
            }
        }
        return (n+1);
    }
    public static void main(String[] args) {
        // int[] nums = {1,2,0,3};
        int[] nums = {3, 4, -1, 1};
        System.out.println(solve(nums));
    }
}
