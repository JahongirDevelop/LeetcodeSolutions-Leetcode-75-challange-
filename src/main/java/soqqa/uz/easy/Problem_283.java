package soqqa.uz.easy;

public class Problem_283 {
    /*
      Path :
      https://leetcode.com/problems/move-zeroes
      */

    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int nonZeroIndex = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is non-zero, move it to the next non-zero index
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                // Increment the non-zero index
                nonZeroIndex++;
            }
        }

        while (nonZeroIndex < nums.length) {
            nums[nonZeroIndex] = 0;
            nonZeroIndex++;
        }
    }
}
