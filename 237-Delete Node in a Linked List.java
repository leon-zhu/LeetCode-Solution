/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//ɾ�������еĸýڵ�
class Solution {
    public void deleteNode(ListNode node) {
        if (node == null)
			return;
		if (node.next != null) {
			node.val = node.next.val;
			node.next = node.next.next;
		}
    }
}

