class Solution {
    public int solution(String t, String p) {
        int length = p.length();
        Long pLong = Long.parseLong(p);
        int count = 0;
        for(int i=0; i<t.length() - length + 1; i++) {
            String str = t.substring(i, i+length);
            if(Long.parseLong(str) <= pLong) {
                count++;
            }
        }
        return count;
    }
}