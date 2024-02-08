package soqqa.uz.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Problem_2215 {
    /*
      Path :
      https://leetcode.com/problems/find-the-difference-of-two-arrays
      */
    public static void main(String[] args) {
    int[] nums1 = {1,2,3}, nums2 = {2,4,6};
        System.out.println(findDifference(nums1, nums2));
    }
    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> set1=new HashSet();
        HashSet<Integer> set2=new HashSet();

        for(int ele: nums1){
            set1.add(ele);
        }

        for(int ele:nums2){
            set2.add(ele);
        }


        List<List<Integer>> list=new ArrayList<>();

        ArrayList<Integer> l1=new ArrayList<>();

        ArrayList<Integer> l2=new ArrayList<>();

        for(int ele:set2){

            if(set1.contains(ele)==false){
                l1.add(ele);
            }
        }


        for(int ele:set1){

            if(set2.contains(ele)==false){
                l2.add(ele);
            }
        }


        list.add(l2);
        list.add(l1);
        return list;
    }
}
