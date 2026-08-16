class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = "";
        String firstIdx = my_string.substring(0, s);
        int endIdx = s + overwrite_string.length();
        String last = my_string.substring(endIdx);
        
        answer = firstIdx + overwrite_string + last;
        
        return answer;
    }
}