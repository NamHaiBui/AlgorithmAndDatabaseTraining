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
        ListNode runningNode = new ListNode(0);
        ListNode slowerNode = runningNode;
        ListNode fasterNode = runningNode;
        slowerNode.next = head;
        
        for(int i = 0; i <= n; i++){
            fasterNode = fasterNode.next;
        }
        if(head.next == null){
            runningNode.next = null;
        }else{
        while(fasterNode != null){
            fasterNode = fasterNode.next;
            slowerNode = slowerNode.next;
        }
        slowerNode.next = slowerNode.next.next;
    }
        return runningNode.next;
    }
}
