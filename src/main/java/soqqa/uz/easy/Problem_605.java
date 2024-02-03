package soqqa.uz.easy;

public class Problem_605 {
    /*
      Path :
      https://leetcode.com/problems/can-place-flowers
      */

    public static void main(String[] args) {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 1;
        canPlaceFlowers(flowerbed, n);
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        int length = flowerbed.length;

        for (int i = 0; i < length; i++) {
            if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == length - 1 || flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1; // Plant a flower
                count++;
            }
        }

        return count >= n;
    }
}
