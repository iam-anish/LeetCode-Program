class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        int mid = end + (start-end)/2;
        while(start<=end){
            mid = end + (start-end)/2;
            if(arr[mid-1]<arr[mid]&&arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(arr[mid]<arr[mid-1]){
                end = mid -1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }
}
