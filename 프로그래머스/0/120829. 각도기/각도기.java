class Solution {
    public int solution(int angle) {
        
        return switch (angle) {
            case 90 -> 2;   
            case 180 -> 4;  
            default -> {
                if (angle > 0 && angle < 90) yield 1;
                else yield 3; 
            }
        };
    }
}