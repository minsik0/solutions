class Solution {
    public int solution(int num, int k) {
        String[] array = Integer.toString(num).split("");
        String str = Integer.toString(k);
        
        for(int i=0; i < array.length; i++) {
            if(array[i].equals(str)) {
            
           return i + 1;
            }
        }
        
        return -1;
    }
}