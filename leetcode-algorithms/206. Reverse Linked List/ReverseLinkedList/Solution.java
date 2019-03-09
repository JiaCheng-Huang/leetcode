package ReverseLinkedList;

import java.util.List;

/**
 * @author Jiacheng Huang
 * @date 2019/03/09 19:58
 */
public class Solution {
    /**
     * 迭代方法
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode result = new ListNode(0);
        result.next = null;
        ListNode p;
        while (head != null) {
            p = head;
            head = head.next;
            p.next = result.next;
            result.next = p;

        }
        return result.next;
    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}