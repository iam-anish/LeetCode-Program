class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
         int i = 0;
        while(temp!=null){
             temp = temp.next;
             i++;
        }
        i = i-1;
        long sum = 0;
        temp = head;
        while(temp!=null){
              sum += (temp.val*Math.pow(2,i));
              temp = temp.next;
              i--;
        }
        return (int)sum;

    }
}
