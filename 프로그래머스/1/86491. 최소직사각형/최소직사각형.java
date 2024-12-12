class Solution {
    public int solution(int[][] sizes) {      
        int numberOne = 0;
        int numberTwo = 0;
        
        for (int i = 0; i<sizes.length; i++) {
            
            int numberThree =  Math.max(sizes[i][0], sizes[i][1]);
            int numberFour = Math.min(sizes[i][0], sizes[i][1]);
            
            numberOne = Math.max(numberOne, numberThree);
            numberTwo = Math.max(numberTwo, numberFour);
        }
        
        int answer = numberOne * numberTwo;
        return answer;
    }
}