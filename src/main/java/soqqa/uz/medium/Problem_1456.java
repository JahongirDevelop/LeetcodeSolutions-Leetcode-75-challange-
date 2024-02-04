package soqqa.uz.medium;

public class Problem_1456 {

     /*
      Path :
      https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length
     */


    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        System.out.println(maxVowels(s, k));
    }


    public static int maxVowels(String s, int k) {
        int max=0;
        int c=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i)))
                c++;
        }
        max=c;
        for(int i=k;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                c++;
            }
            if(isVowel(s.charAt(i-k))){
                c--;
            }
            max=Math.max(max,c);
        }
        return max;
    }
    public static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }


}
