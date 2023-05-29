import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        //queue 하나 만들고 
        //먼저 들어온 순서대로 빼냄
        //queue에 원소 하나씩 넣을 수 있는데 만약 weight보다 현재 원소와 다음 원소 합이 작으면 먼저 들어온거 빼지 말고 다리 안에 넣음 근데 bridge_length 길이만큼만 고려 가능
        //queue에 LinkedList로 다 넣어두고 queue.poll 로 비교하면서 count++해주면 되지 않을까 ??
        
        int answer = 0;

		Queue<Integer> q = new LinkedList<Integer>();
		int sum = 0; // 다리를 건너는 트럭들의 무게 합
		
		for(int t : truck_weights) {
			
			while(true) {
				//큐가 비어있다면 다음 트럭 삽입
				if(q.isEmpty()) {
					q.offer(t);
					sum += t;
					answer++;
					break;
				}
				//큐의 사이즈와 다리의 길이가 같다면 큐에서 큐에서 처음 값을 빼고 최대 무게 -
				else if(q.size() == bridge_length) {
					sum -= q.poll();
				}
				//큐가 비어있지 않을 때
				else {
					//다음 트럭이 최대 무게 초과
					if(sum + t > weight) {
						q.offer(0);
						answer++;
					}
					//다음 트럭이 최대 무게 이내
					else {
						q.offer(t);
						sum += t;
						answer++;
						break;
					}
				}
			}
		}
		
		//걸린 시간 + 마지막 트럭의 통과시간(다리의 길이)
		return answer + bridge_length;
    
    }
}