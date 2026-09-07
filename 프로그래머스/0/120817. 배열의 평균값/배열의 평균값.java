class Solution {
    public double solution(int[] numbers) {
        
        double sum = 0;
        int length = numbers.length;
        
        for(int i=0;i<length;i++)
        {
            sum = sum + numbers[i];
        }
        
        double answer = sum/length;
        
        return answer;
    }
}