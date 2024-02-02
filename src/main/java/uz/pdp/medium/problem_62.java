package uz.pdp.medium;

public class problem_62 {
    /**
     * Path :
     * https://leetcode.com/problems/unique-paths/description/?envType=study-plan-v2&envId=dynamic-programming
     * */

    public static void main(String[] args) {
        System.out.println(uniquePaths(3, 7));
    }

    public static int uniquePaths(int row, int col) {
            long ans = 1;
            for(int i=1; i<=row-1; i++){
                ans = ans * (col-1+i) / i;
            }
            return (int)ans;
        }

}
