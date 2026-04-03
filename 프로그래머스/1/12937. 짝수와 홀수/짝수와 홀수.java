class Solution {
    public String solution(int num) {
        String answer1 = "Odd";
        String answer2 = "Even";
        if(num % 2 == 0) {
            return answer2;   
        } else {
            return answer1;
        }
    }
}