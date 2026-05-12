class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
       
        int cnt = 0; 
        
        String[] array = s.split("");
        
        for (String str : array) {
            if (str.contains(" ")) {
                cnt = 0;
            } else {

                str = (cnt % 2 == 0) ? str.toUpperCase() : str.toLowerCase();
                cnt++;
            }
            answer.append(str);
        }
        
        return answer.toString();
    }
}