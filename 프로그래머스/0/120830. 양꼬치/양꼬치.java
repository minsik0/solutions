class Solution {
    public int solution(int n, int k) {
        
        int a = n / 10;
        int b = k - a;
        
        int total = (n * 12000) + (b * 2000);
        
        return total;
    }
}