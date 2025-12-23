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
    public ListNode insertionSortList(ListNode head) {
    if( head == null) return null;
    ListNode sortedHead = new ListNode(0);

    while(head != null) {
        ListNode current = head;
        head = head.next;
        ListNode prev = sortedHead;
        while(prev.next != null && prev.next.val < current.val){
            prev = prev.next;
        }
        current.next = prev.next;
        prev.next = current;
    }
        return sortedHead.next;
    }
}