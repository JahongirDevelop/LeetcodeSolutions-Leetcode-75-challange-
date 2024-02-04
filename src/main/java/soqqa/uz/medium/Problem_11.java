package soqqa.uz.medium;

public class Problem_11 {
     /*
      Path :
      https://leetcode.com/problems/container-with-most-water
     */

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }


    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            // Calculate the current area
            int currentArea = Math.min(height[left], height[right]) * (right - left);

            // Update maxArea if the current area is greater
            maxArea = Math.max(maxArea, currentArea);

            // Move the pointers based on the smaller height to try to maximize the area
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

}
