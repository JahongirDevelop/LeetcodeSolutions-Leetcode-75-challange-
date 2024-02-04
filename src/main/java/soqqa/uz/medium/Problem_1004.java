package soqqa.uz.medium;

public class Problem_1004 {
 /*
      Path :
      https://leetcode.com/problems/max-consecutive-ones-iii
     */
 public static void main(String[] args) {
     int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
     int k = 2;
     System.out.println(longestOnes(nums, k));
 }



    public static int longestOnes(int[] nums, int k){
        int left = 0,maxCon=0,zCount = 0;
        for (int right=0;right<nums.length;right++){
            if (nums[right]==0){
                zCount++;
                while (zCount>k){
                    if (nums[left]==0){
                        zCount--;
                    }
                    left++;
                }
            }
            maxCon=Math.max(maxCon,right-left+1);
        }
        return maxCon;
    }
}
