import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String s) {
        List<Integer> list = new ArrayList<>();
        int answer = 0;
        
        for (String str : s.split(" ")) {
            if (str.equals("Z")) {
                list.remove(list.size() - 1);
            } else {
                list.add(Integer.parseInt(str));
            }
        }
        for (int num : list) answer += num;
        
        return answer;
    }
}