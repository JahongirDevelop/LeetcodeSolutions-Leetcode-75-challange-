package soqqa.uz.easy;

import java.util.Arrays;

public class Problem_338 {
    /*
      Path :
      https://leetcode.com/problems/counting-bits
      */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(2)));
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        ans[0] = 0;

        for (int i = 1; i <= n; i++) {
            // If i is even, it has the same number of 1's as i/2.
            // If i is odd, it has one more 1 than i/2.
            ans[i] = ans[i / 2] + (i % 2);
        }

        return ans;
    }
}
