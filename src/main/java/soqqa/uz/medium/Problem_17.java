package soqqa.uz.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Problem_17 {
    /*
      Paths :
      https://leetcode.com/problems/letter-combinations-of-a-phone-number
      */

    public static void main(String[] args) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
        // output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    }
    public static List<String> letterCombinations(String digits) {
            Map<Character, String> digitToLetters = new HashMap<>();
            digitToLetters.put('2', "abc");
            digitToLetters.put('3', "def");
            digitToLetters.put('4', "ghi");
            digitToLetters.put('5', "jkl");
            digitToLetters.put('6', "mno");
            digitToLetters.put('7', "pqrs");
            digitToLetters.put('8', "tuv");
            digitToLetters.put('9', "wxyz");

            List<String> result = new ArrayList<>();
            if (digits.length() == 0) return result;

            generateCombinations(digitToLetters, digits, 0, new StringBuilder(), result);

            return result;
        }
        private static void generateCombinations(Map<Character, String> digitToLetters, String digits, int index, StringBuilder current, List<String> result) {
            if (index == digits.length()) {
                result.add(current.toString());
                return;
            }

            char digit = digits.charAt(index);
            String letters = digitToLetters.get(digit);

            for (char letter : letters.toCharArray()) {
                current.append(letter);
                generateCombinations(digitToLetters, digits, index + 1, current, result);
                current.deleteCharAt(current.length() - 1); // Backtrack
            }
        }

}
