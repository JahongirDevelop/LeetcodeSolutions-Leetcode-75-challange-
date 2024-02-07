package soqqa.uz.medium;

public class Problem_198 {
     /*
      Path :
      https://leetcode.com/problems/house-robber
      */
     public static void main(String[] args) {
         int[] nums = {1,2,3,1};
         System.out.println(rob(nums));
     }

    public static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int n = nums.length;
        if (n == 1) {
            return nums[0];
        }

        int prev1 = nums[0];
        int prev2 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            int current = Math.max(prev1 + nums[i], prev2);
            prev1 = prev2;
            prev2 = current;
        }
        return prev2;
    }
}
