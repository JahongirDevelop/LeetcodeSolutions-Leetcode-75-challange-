package soqqa.uz.easy;

import java.util.ArrayList;
import java.util.List;

public class Problem_1431 {
    /*
      Paths :
      https://leetcode.com/problems/kids-with-the-greatest-number-of-candies
      */
    public static void main(String[] args) {
        int candies[] = {2,3,5,1,3}, extraCandies = 3;
        kidsWithCandies(candies, extraCandies);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
