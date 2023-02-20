class Solution {
    public int subtractProductAndSum(int n) {
        
        int sum = 0, prod = 1;

        while (n != 0) {

            // Operation 1, see Approach section
            int rightNumber = n % 10;

            // Operation 2, see Approach section
            sum += rightNumber;
            prod *= rightNumber;

            // Operation 3, see Approach section
            n /= 10;
        }

        return prod - sum;
    }
}
