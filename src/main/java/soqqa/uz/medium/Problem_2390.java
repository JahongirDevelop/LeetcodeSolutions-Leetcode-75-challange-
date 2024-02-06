package soqqa.uz.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Problem_2390 {
    /*
      Path :
      https://leetcode.com/problems/removing-stars-from-a-string
     */



    public static void main(String[] args) {

        String s = "leet**cod*e ";
        System.out.println(removeStars(s));
    }

    public static String removeStars(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length() ; i++) {
            if(sb.charAt(i) == '*'){
                sb.deleteCharAt(i);
                sb.deleteCharAt(i-1);
                i -= 2;
            }
        }
        return sb.toString();
    }

}
