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
// finding the lenght of the li ked list 
        while(curr != null){
            len ++;
            curr = curr.next ;
            }
// if n is equal to len then remove the 1st element and return the list 
        if(n == len){
            return head.next;
        }
        int counter = 0;
        curr = head ;
// going the before element which we want to remove 
        while(counter < len - n - 1){
            curr = curr.next;
            counter ++;
        }
// removing the element .
        curr.next = curr.next.next ;
        return head ;
    }
}