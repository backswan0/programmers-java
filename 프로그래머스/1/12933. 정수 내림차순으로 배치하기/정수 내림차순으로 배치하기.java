import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arrayOne = String.valueOf(n).split("");
        Arrays.sort(arrayOne);
        StringBuilder numbers = new StringBuilder(); 
        for (int i = 0; i<arrayOne.length; i++) {
            numbers.append(arrayOne[i]);
        }
        return Long.parseLong(numbers.reverse().toString());
    }
}