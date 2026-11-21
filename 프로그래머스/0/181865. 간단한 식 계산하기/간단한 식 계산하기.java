class Solution {
    public int solution(String binomial) {
        String[] s = binomial.split(" ");
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[2]);
        
        return switch (s[1]) {
                case "+" -> a + b;
                case "-" -> a - b;
                default -> a * b;
        };
    }
}