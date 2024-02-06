package soqqa.uz.easy;

public class Problem_387 {

    /*
      Path :
      https://leetcode.com/problems/first-unique-character-in-a-string
      */


    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {
            for(int i=0;i<s.length();i++) {
                char ch=s.charAt(i);
                if(s.indexOf(ch)==s.lastIndexOf(ch)) {
                    return i;
                }
            }
            return -1;
    }
}
