import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 1;
            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

            for (int n : priorities) {
                queue.offer(n);
            }

        while(!queue.isEmpty()) {
            
        for (int i = 0; i < priorities.length; i++) {
                if (queue.peek() == priorities[i]) {
                    if (location == i) {
                        return answer;
                    }
                    queue.poll();
                    answer++;
                }
            }
        }
            return answer;
    }
}