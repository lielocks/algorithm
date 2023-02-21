import java.util.*;

class Solution {
    int answer;
    int[] numbers;
    int target;
    
    public void dfs(int index, int sum) {
        //1. 탈출조건
        if(numbers.length == index) {
            if(sum == target) {
                answer++;
            }
            return;
        }
        //2. 수행동작
        dfs(index + 1, sum + numbers[index]);
        dfs(index + 1, sum - numbers[index]);
    }
    
    public int solution(int[] numbers, int target) {
        //마지막 노드까지 탐색했을때의 sum이 target과 일치하면 answer++
        this.answer = answer;
        this.target = target;
        this.numbers = numbers;
        
        dfs(0, 0);
        return answer;
    }
    
}