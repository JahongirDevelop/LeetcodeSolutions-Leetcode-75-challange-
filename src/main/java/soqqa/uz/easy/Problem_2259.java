package soqqa.uz.easy;

public class Problem_2259 {

    /*
      Path :
      https://leetcode.com/problems/remove-digit-from-number-to-maximize-result
      */


    public static void main(String[] args) {
        String number = "1231";
        char digit = '1';
        System.out.println(removeDigit(number, digit));
    }
    public static String removeDigit(String s, char digit) {
        int n = s.length();
        String res = "";
        for(int i=0; i<n; i++){
            if(s.charAt(i)==digit){
                String t = s.substring(0,i)+s.substring(i+1);
                if(t.compareTo(res)>0){
                    res = t;
                }
            }
        }
        return res;
    }
}
