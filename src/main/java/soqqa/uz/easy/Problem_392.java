package soqqa.uz.easy;

public class Problem_392 {
    /*
      Path :
      https://leetcode.com/problems/is-subsequence
      */

    public static void main(String[] args) {
        String s = "abc", t = "ahbgdc";
        String s1 = "axc", t1 = "hwnad";
        System.out.println(isSubsequence(s, t));
        System.out.println(isSubsequence(s1, t1));
    }

    public static boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;

            }
            j++;
        }
        return i == s.length(); // ==
        // Yuqoridagi return qilish bilan bu bir xil

        /* if(i==s.length()){
            return true;
        }else{
            return false;
        }
         */

    }
}
