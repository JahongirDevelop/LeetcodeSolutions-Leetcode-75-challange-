package soqqa.uz.medium;

import java.util.ArrayList;
import java.util.List;

public class Problem_1679 {
     /*
      Path :
      https://leetcode.com/problems/max-number-of-k-sum-pairs
     */

    public static void main(String[] args) {
        int[] integers = {1,2,3,4};
        int k = 5;

        System.out.println(maxOperations(integers, k));

    }

    public static int maxOperations(int[] nums, int k) {
        int res = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int num : nums) {
            int find = k - num;
            if (arrayList.contains(find)){
                res++;
                arrayList.remove(Integer.valueOf(find));
            } else {
                arrayList.add(num);
            }
        }
        return res;

    }

    public static int maxOperations2(int[] nums, int k) {
        List<Integer> arrayList = new ArrayList<>();
        for (Integer element : nums) {
            arrayList.add(element);
        }

        int res = 0;
        int s;

            for (int i = 0; i < arrayList.size(); i++) {
                    int num = arrayList.get(i);
                    System.out.println("arrayList = " + arrayList);
                    System.out.println("numff = " + num);
                    int f;
                    for (int j = i; j < arrayList.size(); j++) {
                        f = arrayList.get(j);
                        s = f + num;
                        System.out.println("num = " + num);
                        System.out.println("f = " + f);
                        System.out.println("s = " + s);
                        if (s == k) {
                            arrayList.remove(j);
                            arrayList.remove(i);
                            res++;
                            System.out.println("res = " + res);
                            System.out.println("arrayList.size() = " + arrayList.size());
                            break;
                        } else {
                            arrayList.add(j);
                            arrayList.add(i);
                        }
                    }
            }
            return res;
    }
}
