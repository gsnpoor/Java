package com.LK;

public class LK_1669 {
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

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode deSta = new ListNode(0,list1);
        ListNode deEnd = new ListNode(0,list1);
        int count = b - a + 1;
        while (count > 0){
            deSta = deSta.next;
            count--;
        }
        count = 0;
        while (count < a) {
            deSta = deSta.next;
            deEnd = deEnd.next;
            count++;
        }
        deEnd.next = list2;
        while (list2.next != null){
            list2 = list2.next;
        }
        list2.next = deSta.next;
        deSta.next = null;
        return list1;
    }
}
