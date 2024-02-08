package soqqa.uz.medium;

public class Problem_1493 {
/*
      Paths :
        https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element
    */
    public static void main(String[] args) {
        int[] nums = {1,1,0,1};
        System.out.println(longestSubarray(nums));
    }
    public static int longestSubarray(int[] nums) {
        int count = 0;
        int n = nums.length;
        int right = 0;
        int left = 0;
        int result = 0;
        while(right < n) {
            if(nums[right]==0) {
                count++;
            }
            while(count > 1) {
                if(nums[left]==0) {
                    count--;
                }
                left++;
            }
            result = Math.max(result, right-left);
            right++;
        }
        return result;
    }
}
