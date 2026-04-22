class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            double root = Math.sqrt(i);
            
            if(root % 1 == 0 ) {
                answer -= i;
            } else {
                answer += i;
            }   
        }
        return answer;
    }
}