class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(n==size){
            head = head.next;
            return head;
        }
        int i = 1;
        int m = size-n;
        ListNode prev = head;
        while(i<m){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;

    }
}
