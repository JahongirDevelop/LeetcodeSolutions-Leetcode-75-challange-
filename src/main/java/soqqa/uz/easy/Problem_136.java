package soqqa.uz.easy;

public class Problem_136 {
    /*
      Path :
      https://leetcode.com/problems/single-number
      */


    public static void main(String[] args) {
        int[] nums = {3, 2,3,4,3,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i]){
                    count++;
                }
            }
            if(count==1){
                return nums[i];
            }
        }
        return -1;
    }
}
