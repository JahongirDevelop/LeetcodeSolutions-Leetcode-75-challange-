package soqqa.uz.medium;

import java.util.Arrays;

public class Problem_215 {
    /*
      Paths :
        https://leetcode.com/problems/kth-largest-element-in-an-array
    */

    public static void main(String[] args) {
        int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums, 2));
    }
    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("nums.length = " + nums.length);
        System.out.println("nums[nums.length - k] = " + nums[nums.length - k]);
        return nums[nums.length - k];
    }
}
