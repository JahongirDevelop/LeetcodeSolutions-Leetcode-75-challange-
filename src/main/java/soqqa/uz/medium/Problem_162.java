package soqqa.uz.medium;

public class Problem_162 {
    /*
      Paths :
        https://leetcode.com/problems/find-peak-element
    */

    public static void main(String[] args) {

    }

    public static int findPeakElement(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[mid + 1]) {
                // The peak element is in the left half
                right = mid;
            } else {
                // The peak element is in the right half
                left = mid + 1;
            }
        }

        return left;
    }


}
