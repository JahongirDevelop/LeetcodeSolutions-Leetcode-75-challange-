package uz.pdp.easy;

public class Problem_1071 {
    /*
      Paths :
      https://leetcode.com/problems/greatest-common-divisor-of-strings
      */

    public static void main(String[] args) {
        String word1 = "ABCABC", word2 = "ABCD";
        System.out.println(gcdOfStrings(word1, word2));
    }


    public static String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
