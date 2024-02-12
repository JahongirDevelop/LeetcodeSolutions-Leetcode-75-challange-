package soqqa.uz.easy;

import java.util.Arrays;

public class Problem_169 {
    public static void main(String[] args) {

    int[] nums = {3, 2, 3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n/2];
    }
}
