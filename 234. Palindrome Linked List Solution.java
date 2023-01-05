class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
              temp = temp.next;
              size++;
        }
        temp = head;
        for(int i=0;i<size/2;i++){
            s.push(temp.val);
            temp=temp.next;
        }
        if(size%2==1){
            temp = temp.next;
        }
        while(temp!=null){
            if(s.peek()==temp.val){
                temp = temp.next;
                s.pop();
            }
            else{
                return false;
            }
        }
        return true;
    }
}
