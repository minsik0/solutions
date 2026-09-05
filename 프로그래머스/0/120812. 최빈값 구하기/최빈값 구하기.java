import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int[] array) {
        Map<Integer, Integer> map = new HashMap<>();
        int answer = 0;
        int maxCount = 0;        
        int cnt = 0; 
        
        for (int num : array) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                answer = num;
                cnt = 1; 
            } else if (count == maxCount && answer != num) {
               cnt++; 
            }
        }
        
        return cnt > 1 ? -1 : answer;
    }
}