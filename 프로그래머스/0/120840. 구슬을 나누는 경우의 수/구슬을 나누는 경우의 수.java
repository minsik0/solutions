class Solution {
    public int solution(int balls, int share) {
        double answer = 1;
        share = Math.min(share, balls - share);
        
        for(int i=0; i < share; i++){
             answer = answer * (balls - i) / (i + 1);
        }
        
         return (int)Math.round(answer);
    }
}