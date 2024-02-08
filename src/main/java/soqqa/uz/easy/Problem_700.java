package soqqa.uz.easy;

public class Problem_700 {
    /*
      Path :
      https://leetcode.com/problems/first-unique-character-in-a-string
      */
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)  return null;
        if(root.val == val) return root;

        if(val < root.val){
            return searchBST(root.left, val);
        }else {
            return searchBST(root.right, val);
        }
    }

    static class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
}
