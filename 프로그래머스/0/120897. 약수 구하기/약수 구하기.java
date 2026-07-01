import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> answerList = new ArrayList<Integer>();
        
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                answerList.add(i);
                if (i * i != n) {
                    answerList.add(n / i);
                }
            }
        }
        Collections.sort(answerList);

        int[] answer = new int[answerList.size()];
        
        for (int i = 0; i < answerList.size(); i++) {
            answer[i] = answerList.get(i); 
        }
        
        return answer;
    }
}