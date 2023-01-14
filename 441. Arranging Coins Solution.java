class Solution {
    public int arrangeCoins(int n){
        if(n<2){
            return n;
        }
        int start = 1;
        int end = n;
        int count = 0;
        int i = 1;
        while(start<=end){
            if((end-i)>=0){
                count++;
                end = end-i;
                i++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
