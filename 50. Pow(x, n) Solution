class Solution {
    public double pow(double x,int n){
        if(n==0){
            return 1;
        }
        double halfpower = pow(x,n/2);
        if(n%2==0){
                return halfpower*halfpower;
        }
        else{
                return x*halfpower*halfpower;
        }
    }
    public double myPow(double x,int n){
        if(n<0){
            return 1/pow(x,n);
        }
        else{
            return pow(x,n);
        }
    }
}
