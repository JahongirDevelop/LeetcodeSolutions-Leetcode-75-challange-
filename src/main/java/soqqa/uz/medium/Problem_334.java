package soqqa.uz.medium;

public class Problem_334 {
    /*
      Path :
      https://leetcode.com/problems/increasing-triplet-subsequence
      */
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        System.out.println(increasingTriplet(nums));

    }

    public static boolean increasingTriplet(int[] nums) {
        int small = 0;
        System.out.println("small = " + small);
        int middle = 0;

        for (int num : nums) {
            if (num <= small){
                small = num;
            } else if (num <= middle) {
                middle = num;
            }
            else return true;
        }
        return false;
    }
}
