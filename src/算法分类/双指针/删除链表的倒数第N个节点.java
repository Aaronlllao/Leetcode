package 算法分类.双指针;

public class 删除链表的倒数第N个节点 {

    /**
     * Leetcode #19
     * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
     *
     * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
     *
     * dummy头节点的作用是方便访问head链表，和处理链表只有一个元素的状况
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode nodeR = dummy;
        ListNode nodeL = dummy;
        for(int i = 1; i <= n+1; i++){
            nodeR = nodeR.next;
        }
        while(nodeR != null){
            nodeR = nodeR.next;
            nodeL = nodeL.next;
        }
        //此时nodeL的指针指向的是被删除节点的前一位，直接返回nodeL是错的
        nodeL.next = nodeL.next.next;
        return dummy.next;
    }


}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
