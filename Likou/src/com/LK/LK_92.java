package com.LK;

public class LK_92 {
    public static class ListNode{
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right)
            return head;
        ListNode end = head;
        ListNode start = new ListNode(0, head);
        for (int i = 0; i < left - 1; i++) {
            start = start.next;
        }
        for (int i = 0; i < right; i++) {
            end = end.next;
        }
        ListNode cur = start.next;
        ListNode pre = end;
        while (cur != null){
            ListNode temp = (cur.next == end ? null: cur.next);
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        if (left == 1){
            return pre;
        }
        start.next = pre;
        return head;
    }
}
