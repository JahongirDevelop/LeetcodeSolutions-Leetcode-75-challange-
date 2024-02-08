package soqqa.uz.medium;

import java.util.*;

public class Problem_735 {
 /*
      Paths :
      https://leetcode.com/problems/asteroid-collision
      */

    public static void main(String[] args) {
        // Test cases
        int[] asteroids1 = {5, 10, -5};
        int[] asteroids2 = {8, -8};
        int[] asteroids3 = {10, 2, -5};

        System.out.println(Arrays.toString(asteroidCollision(asteroids1))); // [5, 10]
        System.out.println(Arrays.toString(asteroidCollision(asteroids2))); // []
        System.out.println(Arrays.toString(asteroidCollision(asteroids3))); // [10]
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (int asteroid : asteroids) {
            if (asteroid > 0 || stack.isEmpty() || stack.peek() < 0) {
                stack.push(asteroid);
            } else {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < -asteroid) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() == -asteroid) {
                    stack.pop();
                } else if (stack.isEmpty() || stack.peek() < 0) {
                    stack.push(asteroid);
                }
            }
        }
        int[] result = new int[stack.size()];
        int index = result.length - 1;
        while (!stack.isEmpty()) {
            result[index--] = stack.pop();
        }

        return result;
    }

}
