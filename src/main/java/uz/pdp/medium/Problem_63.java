package uz.pdp.medium;

public class Problem_63 {
     /*
      Paths :
        https://leetcode.com/problems/unique-paths-ii/description/?envType=study-plan-v2&envId=dynamic-programming
    */

    public static void main(String[] args) {
        int[][] obstacleGrid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };

        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;

        for (int i = 1; i < n; i++) {
            if (obstacleGrid[0][i] == 1) {
                dp[0][i] = 0; // If there is an obstacle, no path can reach this cell
            } else {
                dp[0][i] = dp[0][i - 1]; // Otherwise, it depends on the left cell
            }
        }

        // Fill the first column
        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 1) {
                dp[i][0] = 0; // If there is an obstacle, no path can reach this cell
            } else {
                dp[i][0] = dp[i - 1][0]; // Otherwise, it depends on the upper cell
            }
        }

        // Calculate the number of unique paths for each cell
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0; // If there is an obstacle, no path can reach this cell
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; // Sum of paths from above and left
                }
            }
        }
        return dp[m - 1][n - 1];
}
