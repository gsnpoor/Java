public class LK_83 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode start = head;
        if (start == null || start.next == null) {
            return head;
        }
        ListNode end = head.next;
        while (true) {
            while (start.val == end.val){
                System.out.println("start: "+start.val+ " end: " + end.val);
                if (end.next == null){
                    start.next = null;
                    return head;
                }
                end = end.next;
            }
            start.next = end;
            start = start.next;
            if (end.next == null){
                start.next = null;
                break;
            }
            end = end.next;
        }
        return head;
    }
    public static class ListNode {
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
}
