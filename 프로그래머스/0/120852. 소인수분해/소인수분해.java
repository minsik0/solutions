import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        IntStream.Builder builder = IntStream.builder();
        
        for(int i=2; i <= n; i++) {
            if(n % i == 0) {
                builder.add(i);
                
                while(n % i == 0) {
                    n /= i;
                }
            }
        }
        
        return builder.build().toArray();
    }
}