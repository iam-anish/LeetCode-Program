class Solution {
    public int[][] sortTheStudents(int[][] score, int k){
        long arr[] = new long[score.length];
        for(int i=0;i<score.length;i++){
            arr[i] = score[i][k];
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<(arr.length-1-i);j++){
                if(arr[j]<arr[j+1]){
                    long temp1 = arr[j];
                     arr[j] = arr[j+1];
                     arr[j+1] = temp1;
                    int temp[] = score[j+1];
                    score[j+1] = score[j];
                    score[j] = temp;
                }
            }
        }
        return score;
    }
}
