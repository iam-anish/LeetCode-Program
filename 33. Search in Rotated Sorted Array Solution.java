class Solution {
    public int searchOut(int array[],int target,int si,int ei){
        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;
        if(target==array[mid]){
            return mid;
        }
        //line 1
        if(array[si]<=array[mid]){
           if(array[si]<=target && target<=array[mid]){
               return searchOut(array,target,si,mid-1);
            }
            else{
               return searchOut(array,target,mid+1,ei); 
            }
        }
        else{
            if(array[mid]<=target && target<=array[ei]){
                return searchOut(array,target,mid+1,ei);
            }
            else{
                return searchOut(array,target,si,mid-1);
            }
        }
    }
    public int search(int[] array, int target) {
        return searchOut(array,target,0,array.length-1);
    }
}
