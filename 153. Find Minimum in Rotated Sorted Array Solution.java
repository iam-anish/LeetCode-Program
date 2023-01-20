class Solution {
        public int findMin(int[] nums) {
      int low=0,high = nums.length-1;
      while(low<=high){
      int mid = low + (high-low)/2;
      
      if(nums[low]<=nums[high]){
      //if given array is sorted then then returning 1'st element.
          return nums[0];  
      }
      if(nums[mid]>nums[mid+1]){
      //if nums[mid] is greater then its next element the it means it is the breakpoint and nums[mid] is largest element and its next is lowest.  
          return nums[mid+1];
      }
      else if(nums[mid]<nums[mid-1]){
      //Since the array is sorted and rotated so if an element is smaller than its previous element then that element is lowest of all.
          return nums[mid];
      }
      else if(nums[mid]>=nums[low]){
      //This portion of the array is sorted and we won't find smallest element here so we move our low to mid+1.
          low = mid+1;
      }else if(nums[mid]<=nums[high]){
      //This portion of the array is sorted and we won't find smallest element     here so we move our high to mid-1.  
          high = mid-1;
      }
      }  return -1;
     }
}
