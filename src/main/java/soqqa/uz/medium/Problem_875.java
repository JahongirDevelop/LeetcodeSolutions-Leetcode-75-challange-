package soqqa.uz.medium;

public class Problem_875 {
    /*
      Path :
      https://leetcode.com/problems/koko-eating-bananas
      */

    public static void main(String[] args) {
        int[] piles = {3,6,7,11};
        System.out.println(minEatingSpeed(piles, 8)); // out 4
    }
        public static int minEatingSpeed(int[] piles, int h) {
            int left = 1; // Minimum eating speed
            int right = getMax(piles); // Maximum eating speed

            while (left < right) {
                int mid = left + (right - left) / 2;
                int hours = calculateHours(piles, mid);
                if (hours <= h) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }

            return left;
        }

        private static int getMax(int[] piles) {
            int max = 0;
            for (int pile : piles) {
                max = Math.max(max, pile);
            }
            return max;
        }

        private static int calculateHours(int[] piles, int speed) {
            int hours = 0;
            for (int pile : piles) {
                hours += (pile + speed - 1) / speed; // Ceiling division to get the hours needed
            }
            return hours;
        }

}
