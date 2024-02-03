package soqqa.uz.easy;

public class Problem_345 {
    /*
      Path :
      https://leetcode.com/problems/reverse-vowels-of-a-string
      */

    public static void main(String[] args) {
        System.out.println(reverseVowels("hello")); // Output: "holle"

    }
    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        String vowels = "aeiouAEIOU";

        while (left < right) {
            // Move left pointer until it finds a vowel
            while (left < right && !vowels.contains(chars[left] + "")) {
                left++;
            }

            // Move right pointer until it finds a vowel
            while (left < right && !vowels.contains(chars[right] + "")) {
                right--;
            }

            // Swap the vowels found at left and right pointers
            if (left < right) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
        }

        // Convert char array to string and return
        return new String(chars);
    }
}
