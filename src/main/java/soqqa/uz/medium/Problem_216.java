package soqqa.uz.medium;

import java.util.ArrayList;
import java.util.List;

public class Problem_216 {
    /*
      Paths :
      https://leetcode.com/problems/combination-sum-iii
      */

    public static void main(String[] args) {
        System.out.println(combinationSum3(3, 7));
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        backtrack(k, n, 1, current, result);
        return result;
    }

    private static void backtrack(int k, int n, int start, List<Integer> current, List<List<Integer>> result) {
        if (k == 0 && n == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (k == 0 || n <= 0) {
            return;
        }

        for (int i = start; i <= 9; i++) {
            current.add(i);
            backtrack(k - 1, n - i, i + 1, current, result);
            current.remove(current.size() - 1); // Backtrack
        }
    }
}
