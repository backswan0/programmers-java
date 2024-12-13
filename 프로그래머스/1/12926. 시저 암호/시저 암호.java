class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            
            if (character == ' ') {
                answer += character;
                continue;
            } if ('a' <= character && character <= 'z') {
                answer += (char) ((character - 'a' + n) % 26 + 'a');
            } else {
                answer += (char) ((character - 'A' + n) % 26 + 'A');
            }
        }
        return answer;
    }
}