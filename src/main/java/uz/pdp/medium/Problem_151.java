package uz.pdp.medium;

public class Problem_151 {
    /*
      Paths :
        https://leetcode.com/problems/reverse-words-in-a-string
    */

    public static void main(String[] args) {
        String s = "the sky is blue";
        System.out.println("reverseWords(s) = " + reverseWords(s));
    }

    public static String reverseWords(String s) {
        // Trim leading and trailing spaces
        s = s.trim();

        // Split the string into words using one or more spaces as the delimiter
        String[] words = s.split("\\s+");

        // Reverse the array of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]).append(" ");
        }

        // Remove the trailing space and convert StringBuilder to String
        return reversed.toString().trim();
    }

}
