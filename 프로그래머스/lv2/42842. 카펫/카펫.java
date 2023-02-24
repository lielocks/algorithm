import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        //결과론적으로 생각하지 말기 brown + yellow 약수 구하기 
        //가로길이 > 세로길이 i > j brown이 8이상 이니까 i는 최소 3부터 시작
        //yellow = (i-2) *(j-2)
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for(int i = 3; i < sum; i++) {
            int j = sum / i;
            if(sum % i == 0 && j >= 3) {
                int a = Math.max(i,j); //가로길이 >= 세로길이
                int b = Math.min(i,j);
                int c = (a - 2) * (b - 2);
                
                if(c == yellow) {
                    answer[0] = a;
                    answer[1] = b;
                    return answer;
                }
                
            }
            
        }
        
            return answer;
    }
}