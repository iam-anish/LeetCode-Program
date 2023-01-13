/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int mid = start + (end-start)/2;
        while(start<=end){
            mid = start + (end-start)/2;
            if(isBadVersion(mid)==false){
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
         mid = start + (end-start)/2;
        return mid;
    }
}
