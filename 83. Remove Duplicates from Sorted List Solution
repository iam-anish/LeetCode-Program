class Solution{
    public ListNode deleteDuplicates(ListNode head){
        ListNode slow = head;
        if(head==null){
            return head;
        }
	    ListNode fast = head.next;

		while(slow!=null && fast!=null)
		{
			if(slow.val== fast.val)
			{
				slow.next = fast.next;
				fast = fast.next;
			}
			else{
				slow = slow.next;
				fast = fast.next;
			}
		}
        return head;
    }
}
