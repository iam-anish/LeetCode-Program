class Solution {
    public boolean checkIfExist(int[] arr){
        Arrays.sort(arr);
        if(arr[0]==0&&arr[1]==0){
            return true;
        }
        for(int i=0;i<arr.length;i++){
            int start = 0;
            int end = arr.length-1;
            int mid= start + (end-start)/2;
            if(arr[mid]==0 && i==mid){
                return false;
            }
            while(start<=end){
                mid= start + (end-start)/2;
                if((arr[mid]*2)==arr[i]){
                    return true;
                }
                else if((arr[mid]*2)<arr[i]){
                    start = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return false;
    }
}
