package soqqa.uz.easy;

public class Problem_1732 {
    /*
      Paths :
      https://leetcode.com/problems/find-the-highest-altitude
      */
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {
        int res = 0;
        int high = 0;
        for(int i : gain)
        {
            high = Math.max(high, res + i);
            res += i;
        }
        return high;
    }
}
