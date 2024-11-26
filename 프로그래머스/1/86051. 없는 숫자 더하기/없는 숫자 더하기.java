class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] newArr = new int[10];
        
        for (int i = 0; i<numbers.length; i++) {
            newArr[numbers[i]] = 1;
        }
        
    
        for (int j = 0; j<newArr.length; j++) {
            if (newArr[j]==0) {
                answer+=j;
            }
        }
        return answer;
    }
}