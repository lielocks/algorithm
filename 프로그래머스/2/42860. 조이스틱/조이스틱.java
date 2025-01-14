import java.util.*;

class Solution {
    
    public int solution(String name) {
        int answer = 0;
        int[] diff = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
            
        for(char c : name.toCharArray()) {
            answer += diff[c - 'A'];
        }

        int length = name.length();
        int min = length - 1;

        // 좌우 이동 횟수 구하기 
        // i. 처음 min : 오른쪽으로 쭉 이동
        // ii. Math.min : 연속 A를 만나 되돌아가는게 빠른 경우
        for(int i = 0; i < length; i++) {
            // ex. ___AAAA___ : A 가 끝나는 지점은 6 따라서 conA = 6 + 1
            int conA = i + 1;
            while(conA < length && name.charAt(conA) == 'A') {
                conA++;
            }                
            min = Math.min(min, i + length - conA + Math.min(i, length - conA));
        } 

        return answer + min;
    }
    
}