class Solution {
    public int solution(int num1, int num2) {
        // 정수 나눗셈은 소숫점 이하를 버림 
        int answer = (num1*1000)/num2;
        return answer;
    }
}