class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String c = Integer.toString(a) + Integer.toString(b);
        int d = 2 * a * b;
        int a_b = Integer.parseInt(c);
        
        if(d < a_b) {
            answer = a_b;
        } else {
            answer = d;
        }
        return answer;
    }
}