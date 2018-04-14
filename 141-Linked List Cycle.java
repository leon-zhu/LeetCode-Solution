/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
 //题目: 检测链表是否有环
 //思路: 使用快慢指针: slow = slow.next, fast = fast.next.next;
 //注意: 有两种情况需要注意: 1. 避免因为fast=slow=null而误判 2. 避免初始时fast=slow=head，然后直接检测是否相等
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode fast = head.next, slow = head;
        //fast != null && fast.next != null && slow != null (pay attention: slow != null is redundant)
        while (fast != null && fast.next != null) {
            if (fast == slow)
                return true;
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
