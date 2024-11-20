class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        
        int numOne = x / 10000;
        int numTwo = (x / 1000) % 10;
        int numThree = (x / 100) % 10;
        int numFour = (x / 10) % 10;
        int numFive = x % 10; 
        
        int sum = numOne + numTwo + numThree + numFour + numFive;
        
        if (x%sum != 0) {
            answer = false;
        } 
        return answer;        
    }
}