class Solution {
    public int solution(int n) {
        int gcd = 1;
        
        for (int i = 1; i <= n; i++) {
            if (6 % i == 0 && n % i == 0) {
                gcd = i;
            }
        }
        
        return n / gcd;
    }
}