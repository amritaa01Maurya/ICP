package phase_4.week2;

public class Shortest_Subarray_to_be_Removed_to_Make_Array_Sorted {

    public static int findLengthOfShortestSubarray(int[] nums) {
        int n=nums.length;
        int l =0;
        int r = n - 1;
        while(l < n - 1 && nums[l] <= nums[l + 1]){
            l++;
        }

        if(l == n - 1){
            return 0;
        }
        while(r > 0 && nums[r] >= nums[r-1]){
            r--;
        }

        int ans = Math.min(n - l - 1, r);//we remove either ele right to l or ele left to r
        int i =0;
        int j = r;
        // check if nums[l] <= nums[r] and we can shrink the non-desired subarray
        while(i <= l && j < n){
            if(nums[i] <= nums[j]){
                ans = Math.min(ans, j - i - 1);
                i++;
            }else{
                j++;
            }
        }
        
        return ans;
    } 
       public static void main(String[] args) {
            int[] arr = {1,2,3,10,4,2,3,5};

            System.out.println(findLengthOfShortestSubarray(arr));
    }
}
