/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 */
 //题目: 合并两个有序链表
 //思路: 注意长度不同、长度相同的情况(空指针情况)
 //注意: 保证合并的链表也是非递减的
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        ListNode cur1 = l1, cur2 = l2;
        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                cur.next = cur1;
                cur1 = cur1.next;
            } else {
                cur.next = cur2;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        if (cur1 == null) cur.next = cur2;
        if (cur2 == null) cur.next = cur1;
        return dummy.next;
    }
}