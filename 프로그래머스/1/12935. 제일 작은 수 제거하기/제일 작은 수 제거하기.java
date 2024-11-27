class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1 ) {
            int[] answer = {-1};
            return answer;
        }        
        
        int[] answer = new int[arr.length -1];
        int minimum = arr[0];
        int index = 0;
     
        for (int i = 0; i < arr.length; i++) {
            if (minimum > arr[i]) {
                minimum = arr[i];
            }
        }
        
        for (int j = 0; j < arr.length; j++) {
            if (minimum == arr[j]) {
                continue;
            } else {
                answer[index] = arr[j];
                index += 1;
            }
        }
        return answer;
    }
}