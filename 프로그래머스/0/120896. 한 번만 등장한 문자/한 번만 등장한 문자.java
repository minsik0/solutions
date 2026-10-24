import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(s.indexOf(c) == s.lastIndexOf(c)) {
                sb.append(c);
            }
        }
        
        char[] charArray = sb.toString().toCharArray();
        Arrays.sort(charArray);
        
        return new String(charArray);
    }
}