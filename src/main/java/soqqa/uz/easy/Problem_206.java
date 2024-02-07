package soqqa.uz.easy;

public class Problem_206 {
    /*
      Path :
      https://leetcode.com/problems/reverse-linked-list
      */

    public ListNode reverseList(ListNode head) {
        if(head==null || head.next== null){
            return head;
        }

        ListNode newHead= reverseList(head.next);
        head.next.next= head;
        head.next= null;
        return newHead;
    }

     static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
}
