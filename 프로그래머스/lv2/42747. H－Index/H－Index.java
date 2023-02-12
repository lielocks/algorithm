import java.util.*;

class Solution {
    public int solution(int[] citations) {
       
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++) {
            int h = citations.length - i; //5,4,3,2,1 의 값을 가지는 h
            if(citations[i] >= h) {
                answer = h;
                break;
            }
        }
        return answer;
    }
}