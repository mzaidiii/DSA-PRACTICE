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
        if(head == null || n ==0 ) return head ;
        
        ListNode temp = head ;
        ArrayList <Integer> arr = new ArrayList<>();
        while (temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(arr);
        arr.remove(n-1);
       Collections.reverse(arr);
        ListNode ans = new ListNode(0) ;
        ListNode current = ans ;
        for (int i : arr){
            current.next = new ListNode(i);
            current = current.next ;
        }
        return ans.next ;
    }
}