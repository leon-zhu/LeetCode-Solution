/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * Given 1->1->2, return 1->2.
 * Given 1->1->2->3->3, return 1->2->3
 */
 //题目: 删除链表中的重复节点
 //思路: 出现重复节点值，那么移动指针即可
 //注意: 多个连续重复元素的时候需要注意，只有出现不同值的时候，才改变cur指针
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val)
                cur.next = cur.next.next; 
            else
                cur = cur.next;
        }
        return head;
    }
}