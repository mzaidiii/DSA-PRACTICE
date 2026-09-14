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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if( lists == null || lists.length == 0) return lists[0];

        ListNode ans = new ListNode(0);
        ListNode temp = ans ;

        ArrayList<Integer> arr = new ArrayList<>();
        for (int i =0;i<lists.length ;i++){
            if(lists[i] == null) continue;
            ListNode current = lists[i];
            while (current != null){
                arr.add(current.val);
                current = current.next ;
            }
        }

        Collections.sort(arr);
        for (int i : arr){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        
        return ans.next;
    }
}