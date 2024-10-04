package soqqa.uz.medium;

import java.util.Arrays;

public class Problem_2491 {
    /*
     Path :
     https://leetcode.com/problems/divide-players-into-teams-of-equal-skill
    */
    public static void main(String[] args) {
        int[] skill = {3,2,5,1,3,4};
        System.out.println(dividePlayers(skill));
    }
    public static long dividePlayers(int[] skill) {
        Arrays.sort(skill);
        long ans = 0;
        int i = 0;
        int j = skill.length - 1;
        int check = skill[i] + skill[j];
        while (i < j) {
            if (skill[i] + skill[j] != check) {
                return -1;
            }
            ans += skill[i] * skill[j];
            i++;
            j--;
        }

        return ans;
    }
}
