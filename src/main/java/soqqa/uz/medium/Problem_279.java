package soqqa.uz.medium;

public class Problem_279 {
    /*
      Paths :
        https://leetcode.com/problems/perfect-squares
    */

    public static void main(String[] args) {
        /*
    Example 1:
    Input: n = 12
    Output: 3
    Explanation: 12 = 4 + 4 + 4.

    Example 2:
    Input: n = 13
    Output: 2
    Explanation: 13 = 4 + 9.  */

        System.out.println(numSquares(12));
    }

    public static int numSquares(int n) {
            if (n < 4) return n;

            int ans = n;
            for (int i = 1; i * i <= n; i++) {
                int square = i * i;
                ans = Math.min(ans, 1 + numSquares(n - square));
            }
            return ans;
    }
}
