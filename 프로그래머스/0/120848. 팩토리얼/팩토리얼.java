class Solution {
    public int solution(int n) {
        int answer = 0;
        long f = 1;
        
        for(int i=1; i <= 10; i++){
            f *= i;
            
            if(f > n) {
                return i-1;
            } else if(f == n) {
                return i;
            }
        }
        
       return 10;
    }
}