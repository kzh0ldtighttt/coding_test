import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        
        for (; n != 0; n /= 10) // n을 10으로 나눠서 0이 될 때 까지 반복
            sum += n % 10;

        return sum;
    }
}