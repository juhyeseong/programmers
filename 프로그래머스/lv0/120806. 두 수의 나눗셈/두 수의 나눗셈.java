class Solution {
    public int solution(int num1, int num2) {
        int answer = 0;
        boolean limit = 0 < num1 && num1 <= 100 && 0 < num2 && num2 <= 100;
        
        if(limit) {
            answer = (int)((num1 / (double)num2) * 1000);
        }
        
        return answer;
    }
}