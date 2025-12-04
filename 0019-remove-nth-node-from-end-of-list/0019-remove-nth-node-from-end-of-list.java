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
    public int getLength(ListNode head){
        int length = 0;
        while(head != null) {
            length ++;
            head = head.next;
        }
        return length;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = getLength(head);
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode current = dummy;
    for (int i =0 ; i < length -n;i++){
        current = current.next;

    }
        current.next = current.next.next;
        return dummy.next;
    }
}