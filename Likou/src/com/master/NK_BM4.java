package com.master;

class SolutionBM4{
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode pre = new ListNode(-1);
        ListNode head = pre;
        ListNode l1 = list1;
        ListNode l2 = list2;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val){
                pre.next = l1;
                l1 = l1.next;
                pre = pre.next;
            }else {
                pre.next = l2;
                l2 = l2.next;
                pre = pre.next;
            }
        }
        if (l1 != null){
            pre.next = l1;
        }else {
            pre.next = l2;
        }
        return head.next;
    }
}
public class NK_BM4 {
}
