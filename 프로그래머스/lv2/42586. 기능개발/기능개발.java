import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new LinkedList<>();

            for (int i = 0; i < progresses.length; i++) {
                queue.add( (int) Math.ceil((100.0 - progresses[i]) / speeds[i]) );
            }

            ArrayList<Integer> answer = new ArrayList();

            while (!queue.isEmpty()) {
                int day = queue.poll();
                int count = 1;

                while (!queue.isEmpty() && day >= queue.peek()) {
                    count++;
                    queue.poll();
                }
                answer.add(count);
            }

            return answer.stream().mapToInt(Integer::intValue).toArray();
        }
    }