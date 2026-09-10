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
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head ;
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode current = head ; 
        while (current != null){
            arr.add(current.val);
            current = current.next ;
        }
        ListNode reverse = new ListNode(arr.get(arr.size()-1));
        ListNode temp = reverse ;
        for (int i = arr.size() -2 ; i >= 0 ; i--){
            temp.next = new ListNode(arr.get(i));
            temp = temp.next ;
        }
        return reverse;
    }
}