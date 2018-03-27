/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//删除单链表中的某个节点值
//思路: 替换节点中的值，然后指针跳过该节点即可
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