package soqqa.uz.medium;

import java.util.ArrayList;
import java.util.List;

public class Problem_1291 {
    /*
      Paths :
      https://leetcode.com/problems/sequential-digits/
      */

    public static void main(String[] args) {
        int low1 = 100, high1 = 300;
        System.out.println("Sequential digits between " + low1 + " and " + high1 + ": " + sequentialDigits(low1, high1));

        int low2 = 1000, high2 = 13000;
        System.out.println("Sequential digits between " + low2 + " and " + high2 + ": " + sequentialDigits(low2, high2));

    }

    public static List<Integer> sequentialDigits(int low, int high) {
        String s = "123456789";
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                int num = Integer.parseInt(s.substring(i, j + 1));

                if (num > high) break;
                if (low <= num) res.add(num);
            }
        }

        res.sort(null);
        return res;
    }
}
