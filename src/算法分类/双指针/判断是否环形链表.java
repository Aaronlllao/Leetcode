package 算法分类.双指针;

public class 判断是否环形链表 {
    /**
     * Definition for singly-linked list.
     */
     class ListNode {
         int val;
         ListNode next;
         ListNode(int x) {
             val = x;
             next = null;
         }
     }


    /**
     * Leetcode #141
     * https://leetcode-cn.com/problems/linked-list-cycle
     *
     * 给定一个链表，判断链表中是否有环。
     * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
     * 如果 pos 是 -1，则在该链表中没有环。
     * @param head
     * @return
     */
     public boolean hasCycle(ListNode head) {
         ListNode l1 = head;
         ListNode l2 = head.next;
         while(l1 != null && l2 != null && l2.next != null){
             if(l1 == l2)
                 return true;
             l1 = l1.next;
             l2 = l2.next.next;
         }
         return false;
     }

}
