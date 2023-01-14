class Solution {
    int computermssingcount(int actual, int expected){
        return actual-expected;
    }
    int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int missingcount = computermssingcount(arr[n-1], n);
        int left = 0, right = n-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            missingcount = computermssingcount(arr[mid],mid+1);
            if(missingcount >= k) right = mid-1;
            else left = mid+1;
        }
        // if right becomes -1 then ans is k
        if(right == -1) return k;
        return arr[right] + k - computermssingcount(arr[right],right+1);
    }
};
