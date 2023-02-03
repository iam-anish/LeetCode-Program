class Solution {
    public int numberOfBeams(String[] bank) {
        int arr[] = new int[bank.length];
        int ans = 0;
        for(int i=0;i<bank.length;i++){
            for(int j=0;j<bank[0].length();j++){
                  if(bank[i].charAt(j)=='1'){
                      arr[i]++;
                  }
            }
        }
        int j=0;
        while(arr[j]==0 && j<bank.length-1){
            j++;
        }
        for(int i=j+1;i<bank.length;i++){
            if(arr[i]==0){
                continue;
            }
            else{
               ans += (arr[j]*arr[i]);
               j=i;
            }
        }
        return ans;
    }
}
