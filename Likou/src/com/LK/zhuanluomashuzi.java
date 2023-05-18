package com.LK;

public class zhuanluomashuzi {
    public static void main(String[] args) {
        
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode z = new ListNode(0, head);
        ListNode x = z;
        ListNode y = head;
        for (int i = 0; i < n; i++) {
            y = y.next;
        }
        while (y != null) {
            x = x.next;
            y = y.next;
        }
        x.next = x.next.next;
        return z.next;
    }

    private class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
}
