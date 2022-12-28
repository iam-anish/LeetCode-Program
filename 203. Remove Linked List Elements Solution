class Solution {
    public ListNode removeElements(ListNode head, int val){
        
        ListNode temp = new ListNode();
        temp.next = head;
        head = temp;
        while(head.next!=null){
            if(head.next.val == val){
                head.next = head.next.next;
            }
            else
            head = head.next;
        }
        return temp.next;
    }
}
