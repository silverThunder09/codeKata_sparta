import java.util.Arrays;

class Solution {
    public long solution(long n) {
        char[] chars = String.valueOf(n).toCharArray();
        
        Arrays.sort(chars); 
        
        for (int i = 0; i < chars.length / 2; i++) { 
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }
        
        long answer = Long.parseLong(new String(chars)); 
        return answer;
        
    }
}