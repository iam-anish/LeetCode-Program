class Solution {
    public int integerBreak(int n) {

        int x = (int) Math.pow(3, n / 3);
        int y = (int) Math.pow(3, n / 3 - 1);

        if (n <= 5) {
            if (n == 2) return 1;
            if (n == 3) return 2;
            if (n % 2 == 0) return n / 2 * n / 2;
            else return 6;
        }
        if (n > 5) {
            if (n % 3 == 0) {
                return x;
            }
            if (n % 3 == 1) {
                return y * 4;
            }
            if (n % 3 == 2) {
                return x * 2;
            }
        }

        return -1;
    }
}
