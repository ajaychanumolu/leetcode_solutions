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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode curr = head ;

        while(curr != null){
            len ++;
            curr = curr.next ;
            }
        if(n == len){
            return head.next;
        }
        int counter = 0;
        curr = head ;
        while(counter < len - n - 1){
            curr = curr.next;
            counter ++;
        }
        curr.next = curr.next.next ;
        return head ;
    }
}