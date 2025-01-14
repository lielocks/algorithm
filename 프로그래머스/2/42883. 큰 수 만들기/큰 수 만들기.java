import java.util.*;

class Solution {
    
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int length = number.length();
        int max = 0;

        // "4177252841"
        for(int i = 0; i < length - k; i++) { // 0,1,2,3,4,5
            max = 0;
            for(int j = index; j <= k + i; j++) { // 4 + 5
                if(max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    index = j + 1; // 여기까지 max 로 탐구했으니 다음 i for 문 부터는 이 다음부터 탐색해라
                }
            }
            
            sb.append(max);
        }
        
        return sb.toString();
    }
}