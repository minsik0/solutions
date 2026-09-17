import java.util.*;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        Deque<Integer> deque =  new LinkedList<>();
        
        for(int num : numbers)deque.add(num);
        
        if(direction.equals("right")) {
            deque.addFirst(deque.removeLast());
        } else {
            deque.addLast(deque.removeFirst());
        }
        
        return deque.stream().mapToInt(Integer::intValue).toArray();
    }
}