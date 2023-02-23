import java.util.*;

class Solution {
    public String solution(String number, int k) { 
        int index = 0;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < number.length() - k; i++) {
            int max = 0;
            for(int j = index; j <= i+k; j++) {
                if(max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    index = j+1; 
                    //if문 안에서만 index값을 새로 처리해주는 이유 : max를 찾으면 다음 for문을 돌때 그 max 값 뒤에서부터 돌아야하니까
                }
            }
            sb.append(max);
        }
        return sb.toString();
    }
}