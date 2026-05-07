class Solution {
    public int[] solution(int n, int m) {
        int a = n;
        int b = m;
        
        while (n % m != 0) {
            int temp = n % m;
            n = m;
            m = temp;
        }
        
        int gcd = m;
        int lcm = a * b / gcd;
        
        return new int[]{gcd, lcm};
    }
}