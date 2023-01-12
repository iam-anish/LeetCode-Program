class Solution {
    public char nextGreatestLetter(char[] letters, char target){
        if(target>=letters[letters.length-1] || target<letters[0]){
            return letters[0];
        }
         
        int start = 0;
        int end = letters.length-1;
        int mid = start + (end-start)/2;

        while(start<end){
             mid = start + (end-start)/2;
             if(letters[mid]==target){
                 break;
             }
             else if(letters[mid]<target){
                 start = mid+1;
             }
             else{
                 end = mid-1;
             }
        }
        mid = start + (end-start)/2; 
        while(letters[mid]==target){
              mid++;
        } 

        return letters[mid];
    }
}
