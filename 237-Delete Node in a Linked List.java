/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
//题目: 删除单链表中的某个节点
//思路: 替换节点中的值(值改变即节点改变，并不需要实际内存地址改变)，然后指针跳过该节点即可
//注意: 删除该节点，并不一定需要指向该节点的指针(重要)。可通过交换值，变换要删除节点的逻辑位置。
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