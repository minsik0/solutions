class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int sum = a+b+c;
        int sum1 = a*a + b*b + c*c;
        int sum2 = a*a*a + b*b*b + c*c*c;
        
        if(a == b && b == c) {
            answer = sum * sum1 * sum2;
        } else if(a == b || b == c || a == c) {
            answer = sum * sum1;
        } else {
            answer = sum;
        }
        
        return answer;
    }
}