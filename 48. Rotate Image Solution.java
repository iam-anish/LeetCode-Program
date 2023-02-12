class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix[0].length;
        int limitI = n / 2 - 1;
        int limitJ = limitI;
        if(n % 2 == 1) limitJ++;
        int tempI;
        int tempJ;
        int tempCurrVal = -1;
        for(int i = 0 ; i <= limitI ; i++) {
            for(int j = 0 ; j <= limitJ ; j++) {
                tempI = i;
                tempJ = j;
                for(int k = 0 ; k < 5 ; k++) {
                    int tempTempCurr = tempCurrVal;
                    tempCurrVal = matrix[tempI][tempJ];
                    matrix[tempI][tempJ] = tempTempCurr;
                    int tempTempI = tempI;
                    tempI = tempJ;
                    tempJ = n - 1 - tempTempI;
                }   
            }
        }
    }
}
