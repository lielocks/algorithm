import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people); //[50, 50, 70, 80]
        int index = 0;
        
        for(int i = people.length - 1; i>= index; i--) { //[3,0] [2,0] [1,0] 
            if(people[i] + people[index] <= limit) {
                index++;
                answer++;
            } else answer++;
        }
        return answer;
    }
}