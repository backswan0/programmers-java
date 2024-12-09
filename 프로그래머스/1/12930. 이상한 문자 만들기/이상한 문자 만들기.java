class Solution {
    public String solution(String s) {
        String answer = "";
        
        s = s.toLowerCase();
        
        String[] array = s.split(""); 
        
        int key = 0;
        
        for(int i = 0; i < array.length; i++) {
            if (key % 2 == 0) {
                array[i] = array[i].toUpperCase();               
            }
            if (array[i].isBlank()) {
                key = -1;
            }
            answer += array[i];
            key++;
        }
        return answer;
    }
}