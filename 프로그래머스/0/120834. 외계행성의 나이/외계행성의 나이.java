class Solution {
    public String solution(int age) {
        String strAge = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < strAge.length(); i++) {
            char ch = (char) (strAge.charAt(i) - '0' + 'a');
            sb.append(ch);
        }
        
        return sb.toString();
    }
}