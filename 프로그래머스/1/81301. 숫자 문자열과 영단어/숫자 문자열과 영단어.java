class Solution {
    public int solution(String s) {
        
        String[] array = new String[10];
        
        array[0] = "zero";
        array[1] = "one";
        array[2] = "two";
        array[3] = "three";
        array[4] = "four";
        array[5] = "five";
        array[6] = "six";
        array[7] = "seven";
        array[8] = "eight";
        array[9] = "nine";
        
        for(int i=0;i<array.length;i++) {
        	if(s.contains(array[i])) {
        		s = s.replace(
                    array[i]
                    , Integer.toString(i)
                );
        	}
        }
        return Integer.parseInt(s);
    }
}