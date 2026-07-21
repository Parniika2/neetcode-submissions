/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head==null ||head.next==null) return true;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode secondhalf=reverse(slow.next);
        ListNode first=head;
        ListNode second=secondhalf;
        while(second!=null){
            if(first.val!=second.val){
                reverse(secondhalf);
                return false;
            }
            first=first.next;
            second=second.next;
        }
        reverse(secondhalf);
        return true;
        
    }
    private ListNode reverse(ListNode head){
        if(head==null || head.next==null) return head;
        ListNode newhead=reverse(head.next);
        ListNode front=head.next;
        front.next=head;
        head.next=null;
        return newhead;
    }
}