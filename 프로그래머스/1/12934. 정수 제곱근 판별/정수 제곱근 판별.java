class Solution {
    public long solution(long n) {
        long answer = 0;
        Double number = Math.sqrt(n);
        if (number == number.intValue()) {
            answer = (long) Math.pow(number+1,2);
        } else {
            answer = -1;
        }
        return answer;
    }
}