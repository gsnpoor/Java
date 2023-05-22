package com.master;

class SolutionBM1{
    public ListNode ReverseList(ListNode head) {
        ListNode cur = head;
        ListNode pre = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
    public ListNode ReverseList1(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode last = ReverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return last;
    }
}
class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
}
public class NK_BM1_ReverseList {
    public static void main(String[] args) {

    }
}
